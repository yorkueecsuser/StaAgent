import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        int i = 0;
        do {
            f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
            i++;
        } while (i < 1); // equivalent condition for a single iteration
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}