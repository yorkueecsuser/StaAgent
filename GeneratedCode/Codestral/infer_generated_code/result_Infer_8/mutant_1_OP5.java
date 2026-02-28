import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s;

        // Mutant: Unreachable switch statement
        boolean isFalse = getCondition();
        if (isFalse) {
            int value = 0;
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code is unreachable");
                    break;
                default:
                    // Default code
                    break;
            }
        }
    }

    boolean getCondition() {
        return false;
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}