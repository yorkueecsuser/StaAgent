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
        
        int unreachableSwitchCondition = getSwitchCondition(); // Non-final variable used
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This is unreachable code in badIv.");
                break;
            default:
                // No action needed, making this switch unreachable
                break;
        }
        
        return iv;
    }

    // Another method demonstrating an insecure way of defining an IV (hardcoded string)
    private byte[] alsoBadIv() {
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
        
        int unreachableSwitchCondition = getSwitchCondition(); // Non-final variable used
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This is unreachable code in alsoBadIv.");
                break;
            default:
                // No action needed, making this switch unreachable
                break;
        }
        
        return iv;
    }

    private int getSwitchCondition() {
        return 0; // Dynamically returns a value that will not match any case
    }
}