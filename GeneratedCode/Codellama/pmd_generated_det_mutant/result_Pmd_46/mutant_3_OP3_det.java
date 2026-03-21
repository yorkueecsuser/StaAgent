import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        if (false && false && false && true && false && false && false && false && true && true && false) {boolean fyqejoky = false;}
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}