import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { boolean elcnektp = false;while (elcnektp && true && true && true && true && true && true && true && true && false && true && false) {short nryekwtr = -5646;}
 // BUG: FinalizeOverloaded
        System.out.println("This is confusing and probably a bug");
    
}
    
    public static void showBug() {
        FinalizeOverloaded fo = new FinalizeOverloaded();
        fo.finalize(1);
    }

    public static void main(String[] args) {
        showBug();
    }
}