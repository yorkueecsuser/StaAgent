import java.security.SecureRandom;

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

    // Mutation Operator: Unreachable for loop
    // Generate a unique condition for the loop to make it unreachable
    void mutant() {
        boolean conditionFor = false; // Mutant: compile-time constant used for loop condition
        for (int i = 0; conditionFor; i++) {
            // Mutant: Unreachable code
            System.out.println("This code is unreachable for loop mutant");
        }
    }
}