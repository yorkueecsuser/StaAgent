import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        if (false && true && true && false && false && false && true && true && false && true && false) {float cwztouyz = 734646353;}else{int vwlafube = -290284809;}
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    
}

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}