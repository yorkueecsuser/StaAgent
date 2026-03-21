import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {
void bad() {
    SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes() , "AES");
    secretKeySpec = new SecretKeySpec("my secret here".getBytes() , "AES");
}

    public SecretKeySpec showBug() {
        bad();
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }
}