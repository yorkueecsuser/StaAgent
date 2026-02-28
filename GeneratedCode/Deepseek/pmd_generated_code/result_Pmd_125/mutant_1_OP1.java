import java.security.SecureRandom;

class InsecureCryptoIv {
    void good() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv); // BUG: InsecureCryptoIv
        String dummyVar1 = "abcdefgh"; // This line is added as a result of the Dead Store mutation operator
    }

    void bad() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, }; // BUG: InsecureCryptoIv
        String dummyVar2 = "abcdefgh"; // This line is added as a result of the Dead Store mutation operator
    }

    void alsoBad() {
        byte[] iv = "secret iv in here".getBytes(); // BUG: InsecureCryptoIv
        String dummyVar3 = "abcdefgh"; // This line is added as a result of the Dead Store mutation operator
    }

    // Additional method to demonstrate the bug
    public void showBug() {
        good(); // This method does not call the bad() or alsoBad() methods because they contain the bugs
    }
}