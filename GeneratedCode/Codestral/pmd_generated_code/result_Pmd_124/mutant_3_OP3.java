import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        if (isUnreachable()) {
            // Unreachable if statement added here
            System.out.println("This line should never be printed.");
        }
    }

    public SecretKeySpec showBug() {
        bad();
        if (isUnreachable()) {
            // Unreachable if statement added here
            return null;
        }
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    private boolean isUnreachable() {
        return false; // always false to make it unreachable
    }
}