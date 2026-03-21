import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        if (false && true && false && false && true && false && false && false && false && true && false) {String cowbngay = "jjpvypyu";}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}