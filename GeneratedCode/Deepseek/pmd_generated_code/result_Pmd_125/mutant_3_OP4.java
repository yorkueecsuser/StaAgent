import java.security.SecureRandom;

class InsecureCryptoIv {
    boolean getCondition() {
        return false;
    }

    void good() {
        SecureRandom random = new SecureRandom();
        byte iv[] = new byte[16];
        random.nextBytes(iv);
        if (getCondition()) {
            System.out.println("This is a dead code");
        }
    }

    void bad() {
        byte[] iv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, };
        if (getCondition()) {
            System.out.println("This is a dead code");
        }
    }

    void alsoBad() {
        byte[] iv = "secret iv in here".getBytes();
        if (getCondition()) {
            System.out.println("This is a dead code");
        }
    }

    public void showBug() {
        good();
    }
}