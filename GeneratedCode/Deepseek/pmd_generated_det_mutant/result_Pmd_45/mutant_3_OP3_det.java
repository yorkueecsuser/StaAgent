import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { if (false && true && true && true && true && false && true && true && true && false && false) {String iphnwmpb = "klxvuxzt";}
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