import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    private boolean getUnreachableCondition() {
        return false; // Always false to make it unreachable
    }

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey

        // Mutant code: Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This line will never execute");
        }
    }

    public SecretKeySpec showBug() {
        bad();

        // Mutant code: Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This line will never execute");
        }

        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }
}