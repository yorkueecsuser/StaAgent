import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        if (true && true && false && true && false && false && true && false && true && false && false) {String vutbekci = "fbfptknd";}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}