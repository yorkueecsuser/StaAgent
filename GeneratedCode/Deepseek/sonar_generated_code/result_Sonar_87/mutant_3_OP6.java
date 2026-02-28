import java.lang.Thread;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();

        // Unreachable for loop mutant
        for (boolean conditionFor = getCondition(); conditionFor; /* unreachable code */ ) {
            /* unreachable code */
        }
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();
    }

    // Method to generate a non-final boolean condition for the mutant
    private boolean getCondition() {
        return false;
    }
}