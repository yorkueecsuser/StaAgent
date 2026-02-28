import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        // MUTANT CODE: Duplicate the assignment statement
        SecretKeySpec secretKeySpecDuplicate = new SecretKeySpec("my secret here".getBytes(), "AES");
    }

    public SecretKeySpec showBug() {
        bad();
        SecretKeySpec originalKey = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        // MUTANT CODE: Duplicate the assignment statement
        SecretKeySpec duplicateKey = new SecretKeySpec("my secret here".getBytes(), "AES");
        return originalKey;
    }
}