import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}

// Mutant 1: Duplicate the assignment statement
class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
        System.out.println("Finalize method called"); // Duplicated assignment statement
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}

// Mutant 2: Duplicate the assignment statement
class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
        System.out.println("Finalize method called"); // Duplicated assignment statement
        System.out.println("Finalize method called"); // Duplicated assignment statement
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}