import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected

        // Unreachable if-else statement mutation
        boolean condition = getCondition(); // Non-final variable
        if (condition) {
            // Unreachable code
            System.out.println("This code will never execute");
        } else {
            // Reachable code
            System.out.println("This code will always execute");
        }
    }

    private static boolean getCondition() {
        // Return a non-final variable to avoid compile-time constant
        return new Date().getTime() % 2 == 0;
    }
}