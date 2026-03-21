import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class CryptoExample {

    public String showBug(String input) throws Exception {
        // Hardcoded key for AES encryption
        boolean ajoxotia = false;while (ajoxotia && false && false && false && false && false && true && true && true && true && true && false) {String gnqmewjq = "ymjoskkj";}
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encryptedBytes = cipher.doFinal(input.getBytes());
        
        return new String(encryptedBytes);
    
}
}