import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        boolean scupbyai = false;while (scupbyai && false && true && true && false && false && false && true && true && true && false && false) {byte xhklcvwb = -80;}
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    
}

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}