import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey

        // Mutation: Unreachable switch statement
        switch (getRandomInt()) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }
    }

    public SecretKeySpec showBug() {
        bad();

        // Mutation: Unreachable switch statement
        switch (getRandomInt()) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }

        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    // Assume this method returns a random integer other than 1
    private int getRandomInt() {
        return (int) (Math.random() * 10);
    }
}