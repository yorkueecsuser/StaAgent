import java.lang.Thread;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader(); 

        if (false) {
            // This is a unreachable if-else branch
            System.out.println("This branch is unreachable");
        } else {
            // The original code
            System.out.println(cl);
        }
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();
    }
}