import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    public SecretKeySpec showBug() {
        bad();
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    void unreachableIfElse() {
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            // Unreachable code
            System.out.println("This code should never run.");
        } else {
            // This is the reachable part of the code
            System.out.println("This code is always executed.");
        }
    }
}