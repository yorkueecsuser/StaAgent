import java.lang.Thread;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"

        // Unreachable while loop to avoid unreachable statement error
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("Unreachable code");
        }
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();
    }
}