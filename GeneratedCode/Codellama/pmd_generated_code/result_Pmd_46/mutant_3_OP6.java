import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
        boolean unreachableLoopCondition = false;
        for (int i = 0; unreachableLoopCondition; i++) {
            // unreachable code
        }
    }
}