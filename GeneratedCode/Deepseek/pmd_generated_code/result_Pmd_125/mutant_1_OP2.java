import java.security.SecureRandom;

class InsecureCryptoIv {
    void good() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv); // BUG: InsecureCryptoIv
        byte ivCopy[] = new byte[16];
        random.nextBytes(ivCopy); // Mutated code
    }

    void bad() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, }; // BUG: InsecureCryptoIv
        byte[] badCopy = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, }; // Mutated code
    }

    void alsoBad() {
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
        byte[] alsoBadCopy = "secret iv in here".getBytes(); // Mutated code
    }

    // Additional method to demonstrate the bug
    public void showBug() {
        good(); // This method does not call the bad() or alsoBad() methods because they contain the bugs
    }
}