import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        boolean yizvtsgt = false;while (yizvtsgt && true && true && true && true && false && false && true && true && true && false && false) {String rocgukud = "ubajqitq";}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}