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
        boolean isConditionFalse = getFalseCondition();
        if (isConditionFalse) {
            // This block is unreachable
            System.out.println("This is unreachable code.");
        }

        return secretKeySpec.getEncoded();
    }

    // Helper method to provide dynamic condition
    private boolean getFalseCondition() {
        return false;
    }
}