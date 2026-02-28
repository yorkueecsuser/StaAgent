import java.security.SecureRandom;

class InsecureCryptoIv {

    // Buggy method that uses a hard coded initialization vector
    public byte[] badMethod() {
        byte[] iv = new byte[16];
        for (int i = 0; i < 16; i++) {
            iv[i] = 00; // BUG: InsecureCryptoIv
        }
        return iv;
    }

    // Mutated method that uses an equivalent do-while loop to initialize the vector
    public byte[] mutatedMethod() {
        byte[] iv = new byte[16];
        int i = 0;
        do {
            iv[i] = 00; // BUG: InsecureCryptoIv
            i++;
        } while (i < 16);
        return iv;
    }

    // Correct method that uses a randomly generated initialization vector
    public byte[] goodMethod() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv);
        return iv;
    }

    // Method to demonstrate the bug
    public byte[] showBug() {
        return mutatedMethod();
    }
}