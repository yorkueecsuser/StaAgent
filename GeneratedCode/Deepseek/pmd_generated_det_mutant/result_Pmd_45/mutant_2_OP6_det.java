import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { for  (int unumttjx = 0; unumttjx < 0; unumttjx++) {char kmyosrnc = 'q';}
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