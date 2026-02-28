import javax.crypto.spec.SecretKeySpec;

class CryptoKeyExample {

    public static void main(String[] args) {
        CryptoKeyExample example = new CryptoKeyExample();
        byte[] keyBytes = example.showBug();
        System.out.println(new String(keyBytes));

        // Adding unreachable switch statement
        int unreachableValue = getValue(); 
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never print");
                break;
            default:
                break;
        }
    }

    public byte[] showBug() {
        // Hardcoded cryptographic key
        SecretKeySpec secretKeySpec = new SecretKeySpec("myHardcodedKey123".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        return secretKeySpec.getEncoded();
    }

    // This method provides a way to dynamically obtain a value
    private static int getValue() {
        return 0; // Ensures that the case statement in the switch is never reached
    }
}