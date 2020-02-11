import java.util.ArrayList;
import java.util.List;

/**
 * Tree.java
 * Purpose: Creates the Tree object
 *
 * @author Megha Rastogi
 * @version 1.0 2/11/2020
 */
public class Tree {

    // String to store the tree hash
    private String treeHash;

    // List to store the file data
    private List<String> files;

    /**
     * Constructor to instantiate this class and initialize required objects.
     * Generating SHA1 of treeHash message
     */
    public Tree(String treeHash){
        this.treeHash = GenerateHash.getSHA1(treeHash);
        files = new ArrayList<>();
    }

    /**
     * Gets the TreeHash.
     *
     * @return TreeHash as string
     */
    public String getTreeHash() {
        return treeHash;
    }

    /**
     * Gets the file list description.
     *
     * @return file list as string
     */
    public List<String> getFiles() {
        return files;
    }

    /**
     * Print the Tree object in formatted manner
     *
     * @return string message
     */
    @Override
    public String toString() {
        String message = treeHash + "\n";
        for(String file: files){
            message += file + "\n";
        }
        return message;
    }
}
