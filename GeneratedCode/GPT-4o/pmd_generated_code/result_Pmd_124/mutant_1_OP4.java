import javax.crypto.spec.SecretKeySpec;

class CryptoKeyExample {

    public static void main(String[] args) {
        CryptoKeyExample example = new CryptoKeyExample();
        byte[] keyBytes = example.showBug();
        System.out.println(new String(keyBytes));
    }

    public byte[] showBug() {
        // Hardcoded cryptographic key
        SecretKeySpec secretKeySpec = new SecretKeySpec("myHardcodedKey123".getBytes(), "AES"); // BUG: HardCodedCryptoKey

        // Adding unreachable if-else statement
        boolean condition = getFalseCondition(); // This will always return false
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the reachable branch.");
        }

        return secretKeySpec.getEncoded();
    }

    // Method to simulate a condition that is always false for if statement
    private boolean getFalseCondition() {
        return false;
    }
}