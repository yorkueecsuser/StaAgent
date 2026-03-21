import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        double ccirvjij = -947581631;
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}