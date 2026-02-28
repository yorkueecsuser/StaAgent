import javax.crypto.spec.SecretKeySpec;

class CryptoKeyExample {

    public static void main(String[] args) {
        CryptoKeyExample example = new CryptoKeyExample();
        byte[] keyBytes = example.showBug();
        System.out.println(new String(keyBytes));
    }

    public byte[] showBug() {
        // Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is never executed
            System.out.println("This will never print.");
        } else {
            System.out.println("Unreachable branch added.");
        }

        // Hardcoded cryptographic key
        SecretKeySpec secretKeySpec = new SecretKeySpec("myHardcodedKey123".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        return secretKeySpec.getEncoded();
    }

    // Method used to ensure the condition is runtime evaluated
    private boolean getCondition() {
        return false;
    }
}