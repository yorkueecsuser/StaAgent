import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        int nfpzpecg = 0;switch  (nfpzpecg) {case 1:long hwmavwbj = 254685942;break;default:long iebyoftv = -476772318;break;}
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    
}

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}