import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        boolean qkiynkxx = false;while (qkiynkxx && true && true && true && false && true && true && true && true && false && false && false) {byte vnisohdz = 20;}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}