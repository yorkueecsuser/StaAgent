import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        boolean uyrtibfa = false;while (uyrtibfa && true && true && true && false && false && false && false && true && false && false && false) {int yjtqrpqa = -777542196;}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}