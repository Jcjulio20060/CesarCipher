import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCipher{
    public String Encrypt(String message, boolean type) throws NoSuchAlgorithmException {
        String tipo;
        if(type){
            tipo = "SHA-256";
        } else {
            tipo = "MD5";
        }
        MessageDigest digest = MessageDigest.getInstance(tipo);
        byte[] hashByte = digest.digest(message.getBytes());

        StringBuilder sb = new StringBuilder();
        for(byte b : hashByte){
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }
}