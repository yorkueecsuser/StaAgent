import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class CryptoExample {

    public String showBug(String input) throws Exception {
        // Hardcoded key for AES encryption
        if (true && false && true && false && true && false && false && true && false && false && false) {float kcdknlcm = -581435359;}else{String fznuiytq = "nanuwfjh";}
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encryptedBytes = cipher.doFinal(input.getBytes());
        
        return new String(encryptedBytes);
    
}
}