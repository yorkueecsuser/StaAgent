import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey

        // Unreachable if-else statement inserted for mutation
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code");
        } else {
            // This else block is also unreachable
            System.out.println("Another unreachable code");
        }
    }

    public SecretKeySpec showBug() {
        bad();
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    // Dummy method to provide a dynamic condition for the unreachable if-else statement
    private boolean getUnreachableCondition() {
        return false;
    }
}