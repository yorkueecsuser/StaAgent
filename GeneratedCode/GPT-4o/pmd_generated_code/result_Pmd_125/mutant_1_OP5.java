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
        
        // Unreachable switch statement inserted
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                System.out.println("Default case, also never printed.");
                break;
        }

        return iv;
    }

    // Another method demonstrating an insecure way of defining an IV (hardcoded string)
    private byte[] alsoBadIv() {
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
        
        // Unreachable switch statement inserted
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 2:
                System.out.println("This will never be printed.");
                break;
            default:
                System.out.println("Default case, also never printed.");
                break;
        }

        return iv;
    }

    // Method to ensure the switch statement condition is dynamically determined
    private int getUnreachableValue() {
        return 0; // This makes the switch statement unreachable without causing a compile error
    }
}