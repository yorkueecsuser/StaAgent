import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { if (true && true && true && true && false && true && true && true && true && true && false) {long baenwixb = -765430070;}else{boolean mvlsvvph = false;}
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