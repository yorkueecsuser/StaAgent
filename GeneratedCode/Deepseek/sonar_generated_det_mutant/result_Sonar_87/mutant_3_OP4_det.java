import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        if (true && true && true && false && false && true && false && false && false && true && false) {float rxdtzhhc = -443585921;}else{double opzhesrj = -278841143;}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}