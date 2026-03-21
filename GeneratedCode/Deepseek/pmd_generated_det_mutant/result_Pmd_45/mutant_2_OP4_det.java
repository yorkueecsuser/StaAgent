import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { if (true && true && false && false && true && true && true && true && false && true && false) {char wmxxisod = 't';}else{short nktejimf = 3522;}
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