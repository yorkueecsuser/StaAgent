import java.security.SecureRandom;
import java.util.Random;

class InsecureCryptoIv {
    void good() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv); // BUG: InsecureCryptoIv
    }

    void bad() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, }; // BUG: InsecureCryptoIv
    }

    void alsoBad() {
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
    }

    // Additional method to demonstrate the bug
    public void showBug() {
        good(); // This method does not call the bad() or alsoBad() methods because they contain the bugs
    }

    void mutant() {
        Random random = new Random();
        byte iv[] = new byte[16];
        random.nextBytes(iv);
        // Unreachable if statement mutant
        boolean condition = false;
        if (condition) {
            System.out.println("This code will never be reached.");
        }
    }
}