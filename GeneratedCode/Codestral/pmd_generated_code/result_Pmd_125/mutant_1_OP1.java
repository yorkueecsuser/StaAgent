import java.security.SecureRandom;
import java.util.Random;

class InsecureCryptoIv {

    // Buggy method that uses a hard coded initialization vector
    public byte[] badMethod() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv
        return iv;
    }

    // Correct method that uses a randomly generated initialization vector
    public byte[] goodMethod() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv);

        //Added a dead store mutant
        int deadStoreVariable = generateRandomNumber();
        return iv;
    }

    // Method to demonstrate the bug
    public byte[] showBug() {
        return badMethod();
    }

    // Method to generate a random number
    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}