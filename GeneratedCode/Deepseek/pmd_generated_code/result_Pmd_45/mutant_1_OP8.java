import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int b) { // Mutant 1: Renamed finalize parameter from 'a' to 'b'
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