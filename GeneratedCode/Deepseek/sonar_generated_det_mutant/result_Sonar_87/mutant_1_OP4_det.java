import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        if (true && true && true && false && false && true && false && false && false && true && false) {double kfizxwjp = 526526066;}else{boolean rzteveav = false;}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}