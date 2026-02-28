import javax.crypto.spec.SecretKeySpec;

class CryptoKeyExample {

    public static void main(String[] args) {
        CryptoKeyExample example = new CryptoKeyExample();
        byte[] keyBytes = example.showBug();
        System.out.println(new String(keyBytes));
    }

    public byte[] showBug() {
        // Hardcoded cryptographic key
        SecretKeySpec secretKeySpec = new SecretKeySpec("myHardcodedKey123".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        return secretKeySpec.getEncoded();
    }
    
    // Mutation: Renaming
    public byte[] showBug_mutant() {
        // Hardcoded cryptographic key
        SecretKeySpec a = new SecretKeySpec("myHardcodedKey123".getBytes(), "AES");
        return a.getEncoded();
    }
}