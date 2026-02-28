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

        // Inserted unreachable if statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }

        return iv;
    }
    
    // Method demonstrating an insecure way of defining an IV (hardcoded)
    private byte[] badIv() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv

        // Inserted unreachable if statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }

        return iv;
    }
    
    // Another method demonstrating an insecure way of defining an IV (hardcoded string)
    private byte[] alsoBadIv() {
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv

        // Inserted unreachable if statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }

        return iv;
    }
    
    // Helper method to simulate a false condition at runtime
    private boolean getFalseCondition() {
        return false;
    }
}