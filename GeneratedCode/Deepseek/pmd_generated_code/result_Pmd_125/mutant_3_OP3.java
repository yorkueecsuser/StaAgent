import java.security.SecureRandom;

class InsecureCryptoIv {
    void good() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv); // BUG: InsecureCryptoIv
    }

    void bad() {
        boolean condition = false;
        if (condition) {
            byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, }; // BUG: InsecureCryptoIv
        }
    }

    void alsoBad() {
        boolean condition = false;
        if (condition) {
            byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
        }
    }

    // Additional method to demonstrate the bug
    public void showBug() {
        good(); 
    }
}