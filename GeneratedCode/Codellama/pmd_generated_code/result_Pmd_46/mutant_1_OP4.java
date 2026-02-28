import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }

    // Mutation Operator: Unreachable if-else statement
    public void unreachableIfElse(boolean condition) {
        if (condition) {
            System.out.println("Reachable if-else branch");
        } else {
            System.out.println("Unreachable if-else branch");
        }
    }
}