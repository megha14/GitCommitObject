import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * SimpleApplication.java
 * Purpose: Application's Main Class
 *
 * @author Megha Rastogi
 * @version 1.0 2/11/2020
 */
public class SimpleApplication {

    /**
     * The main method begins execution of the Book Manager Application.
     *
     * @param args not used
     */
    public static void main(String[] args){

        // Initialize Author Object
        Author author = new Author("John Doe", "johndoe@example.com");

        // Initialize Tree Object
        Tree tree = new Tree("First Tree");

        // Add one file to tree
        tree.getFiles().add("First file");

        // Creating first commit
        Commit commit1 = new Commit("First file commited", tree, null, author, author);

        // Creating second commit
        Commit commit2 = new Commit("First file updated", tree, commit1, author, author);

        // Creating third commit
        Commit commit3 = new Commit("Second file commited", tree, commit2, author, author);

        // Creating fourth commit
        Commit commit4 = new Commit("First file commited", tree, commit3, author, author);

        // Create HashSet to add commits
        HashSet<Commit> set = new HashSet<>();

        // Adding the commits to set
        set.add(commit1);
        set.add(commit2);
        set.add(commit3);

        // Check if commit1 is in set. This will invoke hashcode method.
        System.out.println(set.contains(commit1));

        // Check if commit4 is in set This will invoke hashcode method.
        System.out.println(set.contains(commit4));

        // Printing commit4
        System.out.println("\n\n\n"+commit4);

    }
}
