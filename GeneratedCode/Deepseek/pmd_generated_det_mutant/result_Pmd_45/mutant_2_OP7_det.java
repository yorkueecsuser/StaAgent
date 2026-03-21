import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { boolean mixffajt = false;while (mixffajt && true && true && false && true && false && true && false && false && true && true && false) {byte pwaulctn = -33;}
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