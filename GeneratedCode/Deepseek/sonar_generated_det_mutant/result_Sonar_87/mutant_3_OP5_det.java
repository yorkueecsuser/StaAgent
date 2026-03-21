import java.lang.Thread;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int towdkxdo = 0;switch  (towdkxdo) {case 1:String clovjasr = "skgvxscn";break;default:float truytacd = 147084856;break;}
        main.showBug();
    
}

    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        System.out.println(cl);
    }
}