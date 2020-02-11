import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * GenerateHash.java
 * Purpose: Generate SHA1 from string
 *
 * @author Megha Rastogi
 * @version 1.0 2/11/2020
 */
public class GenerateHash {

    /**
     * convert string to sha1
     *
     * @param input string
     * @return sha1 as string
     */
    public static String getSHA1(String input){
        String sha1 = "";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(input.getBytes("utf8"));
            sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
        } catch (Exception e){
            e.printStackTrace();
        }
        return sha1;
    }
}
