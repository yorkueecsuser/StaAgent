import java.security.SecureRandom;

class InsecureCryptoIv {
    private boolean getCondition() {
        return false;
    }

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

    public void showBug() {
        good(); // This method does not call the bad() or alsoBad() methods because they contain the bugs
    }

    void unreachableSwitch() {
        int value = getCondition()? 1 : 0;
        switch (value) {
        } // Unreachable switch statement
    }
}