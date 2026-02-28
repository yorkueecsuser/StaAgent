import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This is confusing and probably a bug");
    }
    
    public static void showBug() {
        FinalizeOverloaded fo = new FinalizeOverloaded();
        fo.finalize(1);
    }

    public static void main(String[] args) {
        showBug();
    }
    
    public void unreachableSwitchStatementMutant() {
        boolean alwaysFalse = false;
        switch (alwaysFalse? 1 : 0) {
            default:
                System.out.println("This is an unreachable switch statement");
                break;
        }
    }
}