import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        // Added unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable code
            System.out.println("Unreachable code");
        }

        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    public SecretKeySpec showBug() {
        bad();
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }
}