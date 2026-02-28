import java.security.SecureRandom;

class InsecureCryptoIv {
    void good(int a, int b) {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv); // BUG: InsecureCryptoIv
    }

    void bad() {
        byte[] z = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, }; // BUG: InsecureCryptoIv
    }

    void alsoBad() {
        byte[] u = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
    }

    // Additional method to demonstrate the bug
    public void showBug() {
        good(7, 8); // This method does not call the bad() or alsoBad() methods because they contain the bugs
    }
}