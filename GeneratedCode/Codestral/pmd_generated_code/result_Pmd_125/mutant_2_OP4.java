import java.security.SecureRandom;

class InsecureCryptoIv {

    // Buggy method that uses a hard coded initialization vector
    public byte[] badMethod() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv

        // Inserted unreachable if-else branch
        if (isUnreachable()) {
            // This code is unreachable
            byte[] unreachableIv = new byte[16];
            System.out.println("This line should never be executed.");
        } else {
            // This is the reachable branch
        }

        return iv;
    }

    // Method to demonstrate the bug
    public byte[] showBug() {
        return badMethod();
    }

    // Method that always returns false
    private boolean isUnreachable() {
        return false;
    }

    // Correct method that uses a randomly generated initialization vector
    public byte[] goodMethod() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv);
        return iv;
    }
}