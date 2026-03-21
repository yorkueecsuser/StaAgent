import javax.crypto.spec.SecretKeySpec;

class CryptoKeyExample {
    public static String CRYPTO_KEY;// = "myHardcodedKey123";

    public static void main(String[] args) {
        CryptoKeyExample example = new CryptoKeyExample();
        byte[] keyBytes = example.showBug();
        System.out.println(new String(keyBytes));
    }

    public void setCryptoKey() {
        for  (int qqlxaqpk = 0; qqlxaqpk < 0; qqlxaqpk++) {short dwfcxwpg = 2630;}
        // Hardcoded cryptographic key
        // return "myHardcodedKey123".getBytes(); // BUG: HardCodedCryptoKey
        this.CRYPTO_KEY = "myHardcodedKey123";
    
}

    public byte[] showBug() {
        // Hardcoded cryptographic key
        // String cryptoKey = getCryptoKey();
        setCryptoKey(); // Set the hardcoded key
        SecretKeySpec secretKeySpec = new SecretKeySpec(CRYPTO_KEY.getBytes(), "AES"); // BUG: HardCodedCryptoKey
        return secretKeySpec.getEncoded();
    }
}