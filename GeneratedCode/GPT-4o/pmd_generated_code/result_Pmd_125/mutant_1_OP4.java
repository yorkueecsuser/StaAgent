import java.security.SecureRandom;

class InsecureCryptoExample {

    public byte[] showBug1() {
        return badIv(); // Demonstrates the bug
    }

    public byte[] showBug2() {
        return alsoBadIv(); // Demonstrates the bug
    }

    // Method demonstrating a secure way to generate an IV
    private byte[] goodIv() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv);
        return iv;
    }

    // Method demonstrating an insecure way of defining an IV (hardcoded)
    private byte[] badIv() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv

        // Introducing an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable branch!");
        } else {
            // Original code continues
        }

        return iv;
    }

    // Another method demonstrating an insecure way of defining an IV (hardcoded string)
    private byte[] alsoBadIv() {
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv

        // Introducing an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is another unreachable branch!");
        } else {
            // Original code continues
        }

        return iv;
    }

    // Helper method to ensure the condition is evaluated at runtime
    private boolean getCondition() {
        return false;
    }
}