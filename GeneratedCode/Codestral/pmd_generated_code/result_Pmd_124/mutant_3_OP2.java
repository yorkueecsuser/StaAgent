import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        // Mutant: Duplication of the assignment statement
        SecretKeySpec secretKeySpecDuplicate = new SecretKeySpec("my secret here".getBytes(), "AES");
    }

    public SecretKeySpec showBug() {
        bad();
        // Mutant: Duplication of the assignment statement
        SecretKeySpec secretKeySpecDuplicate = new SecretKeySpec("my secret here".getBytes(), "AES");
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }
}