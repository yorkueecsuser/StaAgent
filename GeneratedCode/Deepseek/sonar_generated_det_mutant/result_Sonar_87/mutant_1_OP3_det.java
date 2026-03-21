import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        if (true && true && false && true && true && false && false && true && false && false && false) {short pqryfkfu = -9190;}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}