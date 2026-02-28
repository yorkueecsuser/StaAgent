import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    boolean getFalseCondition() {
        return false;
    }

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        while (getFalseCondition()) {
            // Unreachable code added by mutation
            System.out.println("This line should never execute.");
        }
    }

    public SecretKeySpec showBug() {
        bad();
        while (getFalseCondition()) {
            // Unreachable code added by mutation
            System.out.println("This line should never execute.");
        }
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }
}