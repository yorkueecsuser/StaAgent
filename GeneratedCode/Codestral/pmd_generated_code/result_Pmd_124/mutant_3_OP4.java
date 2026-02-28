import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey

        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code will never be executed.");
        } else {
            // This code is always executed
            System.out.println("This code is always executed.");
        }
    }

    public SecretKeySpec showBug() {
        bad();

        if (getUnreachableCondition()) {
            // Unreachable code
            return new SecretKeySpec("unreachable secret".getBytes(), "AES");
        } else {
            // This code is always executed
            return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        }
    }
}