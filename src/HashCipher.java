import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCipher{
    public String Encript(String message) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashByte = digest.digest(message.getBytes());

        StringBuilder sb = new StringBuilder();
        for(byte b : hashByte){
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }
}
