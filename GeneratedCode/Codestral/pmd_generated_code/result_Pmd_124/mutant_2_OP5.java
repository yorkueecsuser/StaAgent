import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey

        // Mutant code: Unreachable switch statement
        boolean shouldNotRun = false;
        switch (shouldNotRun? 1 : 0) {
            case 1:
                System.out.println("This code should never execute.");
                break;
        }
    }

    public SecretKeySpec showBug() {
        bad();
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }
}