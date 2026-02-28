import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s; // original assignment
        f = s; // duplicate assignment; BUG: GUARDEDBY_VIOLATION
        System.out.println(f); // added to avoid unreachable statement error
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}