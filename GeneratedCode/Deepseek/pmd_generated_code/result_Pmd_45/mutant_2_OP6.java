import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { 
        System.out.println("This is confusing and probably a bug");
    }
    
    public static void showBug() {
        FinalizeOverloaded fo = new FinalizeOverloaded();
        fo.finalize(1);
    }
    
    public static void main(String[] args) {
        showBug();
        boolean conditionFor = true; // Mutant: Added for loop with condition that is always true
        for (int i = 0; conditionFor; i++) { 
            // Code in this block is unreachable because the condition is always true
        }
    }
}