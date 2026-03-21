import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        char ynctjxdg = 'e';
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    
}

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}