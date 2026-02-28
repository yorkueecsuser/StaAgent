import java.lang.Thread;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();
    }
}

// Mutated Java Code
class MainClass2 {
    public void showBug() {
        ClassLoader cl1 = this.getClass().getClassLoader();  // Mutant: Renaming variable 'cl' to 'cl1'
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();
    }
}