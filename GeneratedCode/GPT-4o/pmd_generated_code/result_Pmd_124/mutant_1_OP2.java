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
        // Duplicate the above statement per the mutation operator "Duplication"
        SecretKeySpec secretKeySpecDuplicate = new SecretKeySpec("myHardcodedKey123".getBytes(), "AES");
        return secretKeySpec.getEncoded();
    }
}