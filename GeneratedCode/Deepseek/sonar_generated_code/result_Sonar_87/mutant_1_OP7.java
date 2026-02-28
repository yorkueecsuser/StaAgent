import java.lang.Thread;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();

        // Mutant: Unreachable While loop
        boolean unreachable = false;
        while(unreachable) {
            unreachable = getCondition();
        }
    }

    private static boolean getCondition() {
        // This method returns a condition that ensures the while loop in the mutant is unreachable
        return false;
    }
}