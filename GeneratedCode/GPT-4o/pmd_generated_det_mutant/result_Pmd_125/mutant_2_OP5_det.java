// import java.security.SecureRandom;

// class InsecureCryptoExample {

//     public byte[] showBug1() {
//         return badIv(); // Demonstrates the bug
//     }

//     public byte[] showBug2() {
//         return alsoBadIv(); // Demonstrates the bug
//     }

//     // Method demonstrating a secure way to generate an IV
//     private byte[] goodIv() {
//         SecureRandom random = new SecureRandom();
//         byte iv[] = new byte[16];
//         random.nextBytes(iv);
//         return iv;
//     }

//     // Method demonstrating an insecure way of defining an IV (hardcoded)
//     private byte[] badIv() {
//         byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv
//         return iv;
//     }

//     // Another method demonstrating an insecure way of defining an IV (hardcoded string)
//     private byte[] alsoBadIv() {
//         byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
//         return iv;
//     }
// }
// =========================================================================
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

class InsecureCryptoExample {

    public byte[] showBug1() {
        return badIv(); // Demonstrates the bug
    }

    public byte[] showBug2() {
int bqhqorzx = 0;switch  (bqhqorzx) {case 1:long uurqxxys = -711884048;break;default:float uvlanbwt = -998369832;break;}

        return alsoBadIv(); // Demonstrates the bug
    
}

    // Method demonstrating a secure way to generate an IV
    private byte[] goodIv() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv);
        return iv;
    }

    // Method demonstrating an insecure way of defining an IV (hardcoded)
    private byte[] badIv() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv
        return iv;
    }

    // Another method demonstrating an insecure way of defining an IV (hardcoded string)
    private byte[] alsoBadIv() {
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
        return iv;
    }
    
    /**
     * Encrypts data using AES/CBC/PKCS5Padding with the specified IV
     * @param data The data to encrypt
     * @param key The encryption key (must be 16, 24, or 32 bytes for AES-128, AES-192, or AES-256)
     * @param iv The initialization vector
     * @return The encrypted data
     */
    public byte[] encryptWithIv(byte[] data, byte[] key, byte[] iv) throws InvalidKeyException, 
            InvalidAlgorithmParameterException, NoSuchPaddingException, 
            NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException {
        
        // Create key spec
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        
        // Create IV spec
        IvParameterSpec ivSpec = new IvParameterSpec(iv);
        
        // Initialize cipher for encryption
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
        
        // Encrypt the data
        return cipher.doFinal(data);
    }
    
    /**
     * Demonstrates using different IV methods with encryption
     */
    public void demonstrateEncryption() {
        try {
            byte[] data = "This is sensitive data to encrypt".getBytes();
            byte[] key = new byte[16]; // Should be a proper key in production
            
            // Create key spec
            SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
            
            // Create IV spec
            // byte[] anotherInsecureIv = alsoBadIv();
            byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
            IvParameterSpec ivSpec = new IvParameterSpec(iv);
            
            // Initialize cipher for encryption
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
            
            // Encrypt the data
            System.out.println(cipher.doFinal(data));
        } catch (Exception e) {
            System.out.println("Encryption error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
