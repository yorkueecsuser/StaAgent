import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        boolean hliugwgf = false;while (hliugwgf && false && true && true && true && true && false && true && false && false && false && false) {double mjmxybsu = -700822526;}
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    
}
}