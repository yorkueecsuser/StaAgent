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
        iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // Duplicate assignment
        return iv;
    }

    // Another method demonstrating an insecure way of defining an IV (hardcoded string)
    private byte[] alsoBadIv() {
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
        iv = "secret iv in here".getBytes(); // Duplicate assignment
        return iv;
    }
}