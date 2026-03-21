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
        int bwgejfig = 0;switch  (bwgejfig) {case 1:byte kcblafub = -37;break;default:boolean apqmrqji = false;break;}
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec("password".getBytes(), "AES"), new IvParameterSpec(iv));
        byte[] encryptedData = cipher.doFinal("Hello, World!".getBytes());

        // Print encrypted data
        System.out.println("Encrypted data: " + encryptedData);
    
}
}