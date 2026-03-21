import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        if (false && true && false && false && true && true && false && false && false && false && false) {boolean ejwjoedh = false;}
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}