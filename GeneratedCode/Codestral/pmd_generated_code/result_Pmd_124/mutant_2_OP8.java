import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        SecretKeySpec k = secretKeySpec; // Mutant: Renamed variable
    }

    public SecretKeySpec showBug() {
        bad();
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        SecretKeySpec k = secretKeySpec; // Mutant: Renamed variable
        return k;
    }
}