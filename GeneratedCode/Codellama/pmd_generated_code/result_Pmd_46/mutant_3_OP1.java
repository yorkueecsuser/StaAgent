import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
        String abcdefgh = "dead code"; // Dead Store
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}