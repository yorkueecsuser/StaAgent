import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        for (int i = 0; false; i++) {
            // unreachable for loop
            System.out.println("This statement is unreachable!");
        }
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}