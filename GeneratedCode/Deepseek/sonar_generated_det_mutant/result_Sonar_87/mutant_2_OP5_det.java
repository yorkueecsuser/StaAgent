import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int nsdifwzm = 0;switch  (nsdifwzm) {case 1:char pnjfpnxe = 's';break;default:boolean emilkcwa = true;break;}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}