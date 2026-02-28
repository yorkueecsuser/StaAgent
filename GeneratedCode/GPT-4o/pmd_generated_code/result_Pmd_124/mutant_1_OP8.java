import javax.crypto.spec.SecretKeySpec;

class CryptoKeyExample {

    public static void main(String[] args) {
        CryptoKeyExample example = new CryptoKeyExample();
        byte[] keyBytes = example.showBug();
        System.out.println(new String(keyBytes));

        // Mutant Code
        CryptoKeyExample example_a = new CryptoKeyExample();
        byte[] keyBytes_a = example_a.showBug_a();
        System.out.println(new String(keyBytes_a));
    }

    public byte[] showBug() {
        // Hardcoded cryptographic key
        SecretKeySpec secretKeySpec = new SecretKeySpec("myHardcodedKey123".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        return secretKeySpec.getEncoded();
    }
    
    // Mutant Method
    public byte[] showBug_a() {
        // Hardcoded cryptographic key
        SecretKeySpec secretKeySpec_a = new SecretKeySpec("myHardcodedKey123".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        return secretKeySpec_a.getEncoded();
    }
}