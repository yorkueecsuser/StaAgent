import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { 
        System.out.println("This is confusing and probably a bug");
    }
    
    public static void showBug() {
        FinalizeOverloaded fo = new FinalizeOverloaded();
        fo.finalize(1);
        if (false) { 
            System.out.println("This is an unreachable code");
        }
        else {
            System.out.println("This is an unreachable code");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}