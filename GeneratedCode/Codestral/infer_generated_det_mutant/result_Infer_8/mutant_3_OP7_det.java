import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        boolean wlsvspoa = false;while (wlsvspoa && true && true && true && true && true && false && false && true && true && false && false) {byte dalrepqs = -78;}
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    
}

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}