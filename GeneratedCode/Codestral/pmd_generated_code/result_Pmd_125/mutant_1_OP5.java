import java.security.SecureRandom;

class InsecureCryptoIv {

    // Buggy method that uses a hard coded initialization vector
    public byte[] badMethod() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 }; // BUG: InsecureCryptoIv

        // Unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    // This code is unreachable
                    System.out.println("This is an unreachable block of code.");
                    break;
                default:
                    // This code is also unreachable
                    System.out.println("This is another unreachable block of code.");
            }
        }

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
        return badMethod();
    }
}