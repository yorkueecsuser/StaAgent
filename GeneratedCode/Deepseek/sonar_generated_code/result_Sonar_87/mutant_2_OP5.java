import java.lang.Thread;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();

        boolean conditionWhile = false;
        while (conditionWhile) {
            int a = 10;
        }
    }
}