import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This is confusing and probably a bug");
    }
    
    public static void showBug() {
        FinalizeOverloaded fo = new FinalizeOverloaded();
        fo.finalize(1);
    }

    // mutated code
    public static void mutatedCode() {
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("This is a mutant that is unreachable");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}