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