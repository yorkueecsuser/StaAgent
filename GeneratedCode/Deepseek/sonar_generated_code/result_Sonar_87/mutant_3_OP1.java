import java.lang.Thread;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        String randomString = "";  // Mutation: Inserting unused variable declarations (dead store)
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();
    }
}