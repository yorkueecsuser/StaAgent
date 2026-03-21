import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        if (false && false && true && true && true && false && true && false && false && false && false) {String zkitleib = "krpujist";}else{String mkejcrbd = "rrwctikr";}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}