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
        
        // Introduce a non-final variable for the unreachable if-else statement
        boolean condition = checkCondition();
        
        // Unreachable if-else branch
        if (condition) {
            System.out.println("This branch will never execute.");
        } else {
            System.out.println("This branch will always execute.");
        }

        return secretKeySpec.getEncoded();
    }
    
    // A method to ensure condition is always false
    private boolean checkCondition() {
        return false;
    }
}