import java.lang.Thread;

class MainClass {
    public void showMutant() {
        ClassLoader cl = this.getClass().getClassLoader();
        boolean condition = false;
        if (condition) {
            // Mutant code
            System.out.println("This code will never run.");
        }
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showMutant();
    }
}