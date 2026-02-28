import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    boolean getFalseCondition() {
        return false;
    }

    void foo(String s) {
        f = s;
        if (getFalseCondition()) {
            // Unreachable code
            System.out.println("Unreachable code executed");
        }
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}