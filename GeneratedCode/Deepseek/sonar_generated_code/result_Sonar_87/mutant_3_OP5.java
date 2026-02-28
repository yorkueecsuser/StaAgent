import java.lang.Thread;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
    }

    public void unreachableSwitchStatement() {
        int condition = 0;
        switch(condition) {
            case 1:
                System.out.println("Unreachable switch statement");
                break;
            default:
                break;
        }
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();
        myObject.unreachableSwitchStatement();
    }
}