import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

class InsecureCryptoExample {

    public byte[] showBug(byte[] key) throws Exception {
        // Hardcoded IV - This is the bug
        byte[] oetgnltn = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv

        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        IvParameterSpec oetgnltnParameterSpec = new IvParameterSpec(oetgnltn);

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, oetgnltnParameterSpec);

        String njzwbmkn = "This is a secret message";
        byte[] dycxtfzf = cipher.doFinal(njzwbmkn.getBytes());

        return dycxtfzf;
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