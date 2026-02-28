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
        boolean conditionWhile = getCondition(); // Ensure the while loop is unreachable
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is unreachable code in goodIv");
        }
        
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv);
        return iv;
    }

    // Method demonstrating an insecure way of defining an IV (hardcoded)
    private byte[] badIv() {
        boolean conditionWhile = getCondition(); // Ensure the while loop is unreachable
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is unreachable code in badIv");
        }
        
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv
        return iv;
    }

    // Another method demonstrating an insecure way of defining an IV (hardcoded string)
    private byte[] alsoBadIv() {
        boolean conditionWhile = getCondition(); // Ensure the while loop is unreachable
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is unreachable code in alsoBadIv");
        }
        
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
        return iv;
    }

    // Method to simulate a runtime condition
    private boolean getCondition() {
        return false;
    }
}