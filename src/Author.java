import java.sql.Timestamp;
import java.util.Date;

/**
 * Author.java
 * Purpose: Creates the Tree object
 *
 * @author Megha Rastogi
 * @version 1.0 2/11/2020
 */
public class Author {

    // String to store author name
    private String name;

    // String to store author email
    private String email;

    /**
     * Constructor to instantiate this class and initialize required objects.
     *
     */
    public Author(String name, String email){
        this.name = name;
        this.email = email;
    }

    /**
     * Print the Author object in formatted manner
     *
     * @return string message
     */
    @Override
    public String toString() {
        return name + " " + email + " ";
    }
}
