import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int ethynkqx = 0;switch  (ethynkqx) {case 1:float bpgseuno = 515596588;break;default:byte taxjbcff = -104;break;}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}