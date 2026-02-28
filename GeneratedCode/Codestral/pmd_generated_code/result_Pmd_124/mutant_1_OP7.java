import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    boolean getFalseCondition() {
        return false;
    }

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        while (getFalseCondition()) {
            // Unreachable while loop
            System.out.println("This line will never execute");
        }
    }

    public SecretKeySpec showBug() {
        bad();
        while (getFalseCondition()) {
            // Unreachable while loop
            System.out.println("This line will never execute");
        }
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }
}