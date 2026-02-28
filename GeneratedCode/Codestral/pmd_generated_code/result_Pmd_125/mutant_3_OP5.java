import java.security.SecureRandom;

class InsecureCryptoIv {

    // Buggy method that uses a hard coded initialization vector
    public byte[] badMethod() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 };

        // Mutant code: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This code will never be executed
                System.out.println("Unreachable code executed");
                break;
        }

        return iv;
    }

    // Helper method to generate a value that is never equal to 1
    private int getUnreachableValue() {
        return 2;
    }

    // Correct method that uses a randomly generated initialization vector
    public byte[] goodMethod() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv);
        return iv;
    }

    // Method to demonstrate the bug
    public byte[] showBug() {
        return badMethod();
    }
}