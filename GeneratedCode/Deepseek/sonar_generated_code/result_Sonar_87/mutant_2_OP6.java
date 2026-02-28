import java.lang.Thread;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  
        boolean condition = false;
        while(condition) {
            // unreachable code
        }
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();
    }
}