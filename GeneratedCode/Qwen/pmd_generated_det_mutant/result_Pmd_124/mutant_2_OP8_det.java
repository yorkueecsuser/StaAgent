import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class CryptoExample {

    public String showBug(String input) throws Exception {
        // Hardcoded key for AES encryption
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] aibsdcqx = cipher.doFinal(input.getBytes());
        
        return new String(aibsdcqx);
    }
}