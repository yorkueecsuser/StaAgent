import java.security.SecureRandom;

class InsecureCryptoIv {

    // Buggy method that uses a hard coded initialization vector
    public byte[] badMethod() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 };
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block is unreachable
            byte[] unreachableIv = new byte[16];
            for (int i = 0; i < unreachableIv.length; i++) {
                unreachableIv[i] = (byte) i;
            }
            iv = unreachableIv;
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