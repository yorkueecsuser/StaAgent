import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    public SecretKeySpec showBug() {
        if (false && false && false && true && false && false && false && true && false && true && false) {int vcwzwhfz = 860575273;}else{float dndgfxkc = -217509611;}
        bad();
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    
}
}