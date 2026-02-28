import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    private boolean getFalseCondition() {
        return false;
    }

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        // Mutant code
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This loop is unreachable");
        }
    }

    public SecretKeySpec showBug() {
        bad();
        SecretKeySpec key = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        // Mutant code
        if (getFalseCondition()) {
            System.out.println("This block is unreachable");
        }
        return key;
    }
}