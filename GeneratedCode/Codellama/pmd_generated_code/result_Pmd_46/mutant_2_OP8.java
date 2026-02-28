import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected

        // Renaming user-defined variable
        String newVariableName = "abc";
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}