import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        f = s; // original assignment
        f = s; // added duplication of the assignment
        System.out.println(f); // added print statement to avoid unreachable code error
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}