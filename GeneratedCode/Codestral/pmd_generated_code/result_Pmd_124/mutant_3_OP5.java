import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey

        // UNREACHABLE SWITCH STATEMENT MUTANT
        boolean condition = false;
        int value = 1;
        if (condition) {
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    public SecretKeySpec showBug() {
        bad();
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }
}