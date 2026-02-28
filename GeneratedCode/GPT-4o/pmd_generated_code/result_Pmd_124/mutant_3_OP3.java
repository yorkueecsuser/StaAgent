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

        // Introducing an unreachable if statement
        boolean condition = getFalseCondition(); // Method call to ensure it's not a compile-time constant
        if (condition) {
            // This block is unreachable
            System.out.println("This line will never be executed.");
        }

        return secretKeySpec.getEncoded();
    }

    // Method to dynamically determine the condition at runtime
    private boolean getFalseCondition() {
        return false;
    }
}