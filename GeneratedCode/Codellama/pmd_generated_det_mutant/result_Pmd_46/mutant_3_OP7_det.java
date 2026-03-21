import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        boolean lfoicmzk = false;while (lfoicmzk && false && false && true && false && false && true && true && false && false && true && false) {String tghprzfj = "bvelcsxk";}
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}