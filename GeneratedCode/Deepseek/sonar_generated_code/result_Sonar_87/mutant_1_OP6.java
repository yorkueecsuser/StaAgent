import java.lang.Thread;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"

        // Mutant code for Unreachable for loop
        for (int i = 0; false; i++) {
            // Inserting unreachable code to make it unreachable
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();
    }
}