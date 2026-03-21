import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        int zbnoaxmn = 0;switch  (zbnoaxmn) {case 1:long ypzfumgi = -416537116;break;default:int anjnjfmx = -361917346;break;}
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    
}

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}