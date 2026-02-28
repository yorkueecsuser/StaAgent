import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    void bad() {
        while (getUnreachableCondition()) { // Mutant: Unreachable while loop
            System.out.println("This code will never be executed.");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    public SecretKeySpec showBug() {
        bad();
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }
}