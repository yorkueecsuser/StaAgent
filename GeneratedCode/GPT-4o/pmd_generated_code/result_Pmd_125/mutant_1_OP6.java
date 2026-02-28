import java.security.SecureRandom;

class InsecureCryptoExample {

    public byte[] showBug1() {
        boolean conditionFor = getCondition(); // Non-final variable to avoid compile-time constant
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable due to the condition being false at runtime
        }
        return badIv(); // Demonstrates the bug
    }

    public byte[] showBug2() {
        boolean conditionFor = getCondition(); // Non-final variable to avoid compile-time constant
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable due to the condition being false at runtime
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
    
    // Method to provide a condition for the unreachable loop
    private boolean getCondition() {
        return false; // Always returns false, making the loop condition false at runtime
    }
}