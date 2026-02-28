import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        deadStore = "Unused value"; // Dead Store mutant
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}