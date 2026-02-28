import java.lang.Thread;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        if (false) {
            boolean condition = false;
            if (condition) {
                // unreachable branch
                System.out.println("This branch will never be executed");
            } else {
                // unreachable branch
                System.out.println("This branch will never be executed");
            }
        }
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();
    }
}