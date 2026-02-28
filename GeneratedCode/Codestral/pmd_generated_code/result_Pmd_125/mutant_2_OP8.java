import java.security.SecureRandom;

class InsecureCryptoIv {

    // Buggy method that uses a hard coded initialization vector
    public byte[] badMethod() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv
        return iv;
    }

    // Mutated method that uses a randomly generated initialization vector with renamed variable
    public byte[] goodMethod() {
        SecureRandom random = new SecureRandom();
        byte r[] = new byte[16];    // Renamed iv to r
        random.nextBytes(r);
        return r;
    }

    // Method to demonstrate the bug
    public byte[] showBug() {
        return badMethod();
    }
}