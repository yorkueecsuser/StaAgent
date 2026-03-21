import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        for  (int vplfvuqr = 0; vplfvuqr < 0; vplfvuqr++) {boolean qrmgwqtw = false;}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}