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

        // Adding an unreachable for loop
        boolean runLoop = getLoopCondition();
        for (int i = 0; runLoop; i++) {
            System.out.println("This loop is unreachable.");
        }

        return secretKeySpec.getEncoded();
    }

    private boolean getLoopCondition() {
        return false; // The loop will never run because the condition is always false
    }
}