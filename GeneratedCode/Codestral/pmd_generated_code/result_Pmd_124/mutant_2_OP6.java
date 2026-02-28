import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    private static boolean alwaysFalse() {
        return false;
    }

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES");
        for (int i = 0; alwaysFalse(); i++) {
            // Unreachable code
        }
    }

    public SecretKeySpec showBug() {
        bad();
        for (int i = 0; alwaysFalse(); i++) {
            // Unreachable code
        }
        return new SecretKeySpec("my secret here".getBytes(), "AES");
    }
}