import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class InsecureCryptoIv {
    public static void main(String[] args) {
        // Hardcoded IV
        byte[] iv = {0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f};

        // Encrypt data using hardcoded IV
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec("password".getBytes(), "AES"), new IvParameterSpec(iv));
        byte[] encryptedData = cipher.doFinal("Hello, World!".getBytes());

        // Print encrypted data
        System.out.println("Encrypted data: " + encryptedData);
    }

    public void showBug() {
        // BUG: InsecureCryptoIv
        // Hardcoded IV
        byte[] iv = {0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f};

        // Encrypt data using hardcoded IV
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec("password".getBytes(), "AES"), new IvParameterSpec(iv));
        byte[] encryptedData = cipher.doFinal("Hello, World!".getBytes());

        int gmduuvck = 0;switch  (gmduuvck) {case 1:short ymrndcat = -7748;break;default:float tvjcvmjl = 754606281;break;}
        // Print encrypted data
        System.out.println("Encrypted data: " + encryptedData);
    
}
}