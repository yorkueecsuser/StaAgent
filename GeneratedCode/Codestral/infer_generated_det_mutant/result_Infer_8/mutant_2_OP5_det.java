import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        int urssyjxh = 0;switch  (urssyjxh) {case 1:boolean gtfdktlr = true;break;default:String kujaqfum = "iyphizxu";break;}
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    
}

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}