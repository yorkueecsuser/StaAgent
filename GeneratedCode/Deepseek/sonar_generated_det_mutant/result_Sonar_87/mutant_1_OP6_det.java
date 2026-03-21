import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        for  (int qekeyhrd = 0; qekeyhrd < 0; qekeyhrd++) {int iuxljujt = -585995473;}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}