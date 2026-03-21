import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { boolean hhybomwd = false;while (hhybomwd && false && false && false && false && false && false && false && true && true && false && false) {double gzmjmciz = -909027200;}
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