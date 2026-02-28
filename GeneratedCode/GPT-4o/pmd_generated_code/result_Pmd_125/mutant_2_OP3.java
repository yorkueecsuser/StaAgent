import java.security.SecureRandom;

class InsecureCryptoExample {

    public byte[] showBug1() {
        boolean condition = getCondition(); // Unreachable if statement
        if (condition) {
            // This block is unreachable as condition is always false
            System.out.println("This is an unreachable code block in showBug1.");
        }
        return badIv(); // Demonstrates the bug
    }

    public byte[] showBug2() {
        boolean condition = getCondition(); // Unreachable if statement
        if (condition) {
            // This block is unreachable as condition is always false
            System.out.println("This is an unreachable code block in showBug2.");
        }
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
        boolean condition = getCondition(); // Unreachable if statement
        if (condition) {
            // This block is unreachable as condition is always false
            System.out.println("This is an unreachable code block in badIv.");
        }
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv
        return iv;
    }

    // Another method demonstrating an insecure way of defining an IV (hardcoded string)
    private byte[] alsoBadIv() {
        boolean condition = getCondition(); // Unreachable if statement
        if (condition) {
            // This block is unreachable as condition is always false
            System.out.println("This is an unreachable code block in alsoBadIv.");
        }
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
        return iv;
    }

    // Method to simulate a runtime condition
    private boolean getCondition() {
        return false; // This simulates an unreachable condition
    }
}