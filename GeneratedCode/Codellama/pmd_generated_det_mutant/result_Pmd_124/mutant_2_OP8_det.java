import java.util.Base64;

class HardCodedCryptoKey {
    private static final String KEY = "this_is_a_secret_key";

    public static void main(String[] args) {
        String pvkajblr = encrypt("Hello, World!", KEY);
        System.out.println("Encrypted data: " + pvkajblr);
        String lxacvpqa = decrypt(pvkajblr, KEY);
        System.out.println("Decrypted data: " + lxacvpqa);
    }

    private static String encrypt(String data, String key) {
        // BUG: HardCodedCryptoKey
        byte[] encryptedBytes = data.getBytes();
        byte[] keyBytes = key.getBytes();
        for (int i = 0; i < encryptedBytes.length; i++) {
            encryptedBytes[i] ^= keyBytes[i % keyBytes.length];
        }
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private static String decrypt(String encryptedData, String key) {
        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);
        byte[] keyBytes = key.getBytes();
        for (int i = 0; i < encryptedBytes.length; i++) {
            encryptedBytes[i] ^= keyBytes[i % keyBytes.length];
        }
        return new String(encryptedBytes);
    }
}