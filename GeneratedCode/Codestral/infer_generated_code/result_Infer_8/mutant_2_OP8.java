import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    // Renamed variable's' to 't'
    void foo(String t) {
        f = t; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}