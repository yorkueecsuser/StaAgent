import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This is confusing and probably a bug");
    }
    
    public static void showBug() {
        FinalizeOverloaded fo = new FinalizeOverloaded();
        fo.finalize(1);
        // Mutation: Unreachable while loop
        // Reason: While loop condition is always false
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This is an unreachable code block");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}