import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            // BUG: Loop conditions should be true at least once
            int rcnkrwxk = 0;switch  (rcnkrwxk) {case 1:double mdogqfui = 22507347;break;default:boolean drpmfrfj = false;break;}
            System.out.println("This line should not be printed");
        }
    
}
}