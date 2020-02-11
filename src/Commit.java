import java.sql.Timestamp;
import java.util.Objects;

/**
 * Commit.java
 * Purpose: Creates the commit object
 *
 * @author Megha Rastogi
 * @version 1.0 2/11/2020
 */
public final class Commit {

    // String to store the commit
    private String commitHash;

    // Tree to which commit is a part of
    private Tree tree;

    // Parent of present commit
    private Commit parent;

    // Object to store author details
    private Author author;

    //Object to store author details
    private Author commiter;

    // String to store the message
    private String message;

    // Object to store the timestamp
    private Timestamp timestamp;


    /**
     * Constructor to instantiate this class and initialize required objects.
     * Generating SHA1 of commit message
     */
    public Commit(String message, Tree tree, Commit parent, Author author, Author commiter){
        commitHash = GenerateHash.getSHA1(message);
        this.tree = tree;
        this.parent = parent;
        this.author = author;
        this.commiter = commiter;
        this.message = message;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    /**
     * Print the Commit object in formatted manner
     *
     * @return string message
     */
    @Override
    public String toString() {
        String m = "tree " + tree.getTreeHash() + "\n" +
                "author " + author.toString() + "\n" +
                "commiter " + commiter.toString() + "\n" +
                "date " + timestamp+"\n\n"+
                message +"\n\n";
        if(parent != null){
            m += parent.toString();
        }
        return m;

    }

    /**
     * Compare Commit Object with other objects
     * Comparing on the basis of commitHash, tree's treeHash and parent
     *
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commit commit = (Commit) o;
        return commitHash.equals(commit.commitHash) &&
                tree.getTreeHash().equals(commit.tree.getTreeHash()) &&
                Objects.equals(parent, commit.parent);
    }

    /**
     * Generate unique hashcode for the object using commitHash, tree's treeHash and parent
     *
     * @return int hash value
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (commitHash == null ? 0 : commitHash.hashCode());
        hash = 31 * hash + (tree.getTreeHash() == null ? 0 : tree.getTreeHash().hashCode());
        hash = 31 * hash + (parent == null ? 0 : parent.hashCode());
        //System.out.println("HashCode Called for "+message+" is "+hash);
        return hash;
    }
}
