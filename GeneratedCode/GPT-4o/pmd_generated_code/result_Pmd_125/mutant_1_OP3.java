import java.security.SecureRandom;

class InsecureCryptoExample {

    public byte[] showBug1() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable due to the condition always being false.
            System.out.println("This is unreachable code for showBug1.");
        }
        return badIv(); // Demonstrates the bug
    }

    public byte[] showBug2() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable due to the condition always being false.
            System.out.println("This is unreachable code for showBug2.");
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
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv
        return iv;
    }

    // Another method demonstrating an insecure way of defining an IV (hardcoded string)
    private byte[] alsoBadIv() {
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
        return iv;
    }

    // Method to simulate dynamic condition, always returns false
    private boolean getUnreachableCondition() {
        return false;
    }
}