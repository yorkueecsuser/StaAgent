import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        boolean vcxpgvlu = false;while (vcxpgvlu && false && false && true && true && false && false && false && false && false && true && false) {int vuuolddt = -529672150;}
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    
}
}