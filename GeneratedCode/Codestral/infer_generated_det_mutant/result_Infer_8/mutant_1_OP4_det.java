import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        if (false && false && false && false && false && true && false && true && true && true && false) {float ptjmtjjz = 604733391;}else{long mijcpteg = 735016623;}
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    
}

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}