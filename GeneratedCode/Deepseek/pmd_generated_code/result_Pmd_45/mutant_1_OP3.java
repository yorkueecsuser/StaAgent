import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) {
        System.out.println("This is confusing and probably a bug");
        if (false) {
            // This is a mutation operator for Unreachable if statement.
            // This code will never be executed because it is after a return statement, which terminates the method.
            System.out.println("This code will never be reached");
        }
    }

    public static void showBug() {
        FinalizeOverloaded fo = new FinalizeOverloaded();
        fo.finalize(1);
    }

    public static void main(String[] args) {
        showBug();
    }
}