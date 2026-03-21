import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { if (false && false && false && false && false && true && false && false && true && false && false) {boolean yiqkkqvm = false;}
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