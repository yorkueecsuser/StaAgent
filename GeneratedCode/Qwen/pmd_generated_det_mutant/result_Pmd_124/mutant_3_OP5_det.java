import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class CryptoExample {

    public String showBug(String input) throws Exception {
        // Hardcoded key for AES encryption
        int whbjpaca = 0;switch  (whbjpaca) {case 1:short jhkqkwct = -6363;break;default:boolean zekaoqxh = false;break;}
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encryptedBytes = cipher.doFinal(input.getBytes());
        
        return new String(encryptedBytes);
    
}
}