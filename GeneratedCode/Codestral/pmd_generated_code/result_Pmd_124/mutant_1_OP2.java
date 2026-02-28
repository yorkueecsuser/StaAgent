import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        SecretKeySpec secretKeySpecDuplicate = new SecretKeySpec("my secret here".getBytes(), "AES"); // Mutant: Duplication
    }

    public SecretKeySpec showBug() {
        bad();
        SecretKeySpec secretKeySpecOriginal = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        SecretKeySpec secretKeySpecDuplicate = new SecretKeySpec("my secret here".getBytes(), "AES"); // Mutant: Duplication
        return secretKeySpecOriginal;
    }
}