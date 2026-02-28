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
        
        // Inserted unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is unreachable code due to condition being false.");
        }
        
        return iv;
    }

    // Method demonstrating an insecure way of defining an IV (hardcoded)
    private byte[] badIv() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv
        
        // Inserted unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is unreachable code due to condition being false.");
        }
        
        return iv;
    }

    // Another method demonstrating an insecure way of defining an IV (hardcoded string)
    private byte[] alsoBadIv() {
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
        
        // Inserted unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is unreachable code due to condition being false.");
        }
        
        return iv;
    }

    // Method to simulate a condition, always returns false to make the branch unreachable
    private boolean getCondition() {
        return false;
    }
}