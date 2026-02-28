import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
        boolean condition = getCondition();
        if (condition) {
            // do nothing
        } else {
            // do nothing
        }
    }

    private static boolean getCondition() {
        return false;
    }
}