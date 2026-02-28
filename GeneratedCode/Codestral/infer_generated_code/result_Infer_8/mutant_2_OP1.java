import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        String unused_variable = "deadstore"; // This is the dead store
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}