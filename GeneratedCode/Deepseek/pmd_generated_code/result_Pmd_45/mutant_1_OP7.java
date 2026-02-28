import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This is confusing and probably a bug");
    }

    public static void showBug() {
        FinalizeOverloaded fo = new FinalizeOverloaded();
        fo.finalize(1);
    }
    
    protected boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug();
        while(getCondition()) {
            // Unreachable code
        }
    }
}