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
        
        // Introducing a mutation: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable and will never be executed.");
        }

        return secretKeySpec.getEncoded();
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}