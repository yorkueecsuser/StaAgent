import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKeyBug {

    void bad() {
        String a = "my secret here";
        SecretKeySpec secretKeySpec = new SecretKeySpec(a.getBytes(), "AES"); // BUG: HardCodedCryptoKey
        // Mutant: Renaming the variable 'a' to 'b'
        String b = "my secret here";
        SecretKeySpec mutantKeySpec = new SecretKeySpec(b.getBytes(), "AES"); // Mutant
    }

    public SecretKeySpec showBug() {
        bad();
        String c = "my secret here";
        SecretKeySpec originalKeySpec = new SecretKeySpec(c.getBytes(), "AES"); // BUG: HardCodedCryptoKey
        // Mutant: Renaming the variable 'c' to 'd'
        String d = "my secret here";
        SecretKeySpec mutantKeySpec = new SecretKeySpec(d.getBytes(), "AES"); // Mutant
        return originalKeySpec;
    }
}