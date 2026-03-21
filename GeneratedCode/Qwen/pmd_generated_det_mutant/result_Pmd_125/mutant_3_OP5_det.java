import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

class InsecureCryptoExample {

    public byte[] showBug(byte[] key) throws Exception {
        // Hardcoded IV - This is the bug
        int wkzmxaoi = 0;switch  (wkzmxaoi) {case 1:byte erxnfqqo = -60;break;default:short ypwxvutl = 1624;break;}
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv

        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);

        String plainText = "This is a secret message";
        byte[] encrypted = cipher.doFinal(plainText.getBytes());

        return encrypted;
    
}

    public static void main(String[] args) {
        try {
            InsecureCryptoExample example = new InsecureCryptoExample();
            SecureRandom random = new SecureRandom();
            byte[] key = new byte[16];
            random.nextBytes(key);

            byte[] encryptedMessage = example.showBug(key);
            System.out.println("Encrypted Message: " + java.util.Base64.getEncoder().encodeToString(encryptedMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}