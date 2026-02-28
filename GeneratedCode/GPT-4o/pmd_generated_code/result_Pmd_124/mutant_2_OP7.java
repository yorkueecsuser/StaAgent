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
        
        // Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block should never be executed
            System.out.println("This is unreachable.");
        }
        
        return secretKeySpec.getEncoded();
    }

    private boolean getCondition() {
        return false;
    }
}