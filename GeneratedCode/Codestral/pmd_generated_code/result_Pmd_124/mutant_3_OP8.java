import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        SecretKeySpec anotherSecretKeySpec = secretKeySpec; // mutant: renamed variable
    }

    public SecretKeySpec showBug() {
        bad();
        SecretKeySpec a = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        return a; // mutant: renamed variable
    }
}