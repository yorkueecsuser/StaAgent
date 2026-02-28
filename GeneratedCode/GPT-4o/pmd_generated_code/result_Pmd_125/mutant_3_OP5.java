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
            case 999: // This block is unreachable since unreachableValue never equals 999
                System.out.println("This should never be printed.");
                break;
            default:
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
            case 888: // This block is unreachable since unreachableValue never equals 888
                System.out.println("This should never be printed.");
                break;
            default:
                break;
        }
        return iv;
    }

    // Method to simulate a dynamic value for switch condition
    private int getUnreachableValue() {
        return -1; // Ensures the switch case never matches
    }
}