import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
        // Mutant code (Duplication)
        f = s; // Duplicated assignment statement
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}