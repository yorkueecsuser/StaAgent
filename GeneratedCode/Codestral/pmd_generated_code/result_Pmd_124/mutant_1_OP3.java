import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey

        // Mutant: Unreachable if statement
        if (getUnreachableCondition()) {
            // This code will never execute, as getUnreachableCondition() always returns false
            System.out.println("This is an unreachable code block");
        }
    }

    public SecretKeySpec showBug() {
        bad();
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }
}