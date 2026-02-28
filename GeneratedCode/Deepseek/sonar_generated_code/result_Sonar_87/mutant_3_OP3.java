import java.lang.Thread;
import java.lang.ClassLoader;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();
        boolean alwaysFalse = false;  // Mutant: Added a variable named "alwaysFalse" which is always false.
        if (alwaysFalse) {  // Mutant: If statement is always unreachable
            System.out.println("This is an unreachable if statement that is added as a false mutant.");
        }
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();
    }
}