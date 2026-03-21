import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        if (false && false && true && false && true && true && false && true && true && true && false) {String gsgejjkd = "rtcpyuzh";}else{String jbzvirco = "bekmvepn";}
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    
}

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}