import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            // BUG: Loop conditions should be true at least once
            int fxudbadw = 0;switch  (fxudbadw) {case 1:int olbrpwqi = -598356151;break;default:boolean hsejporv = true;break;}
            System.out.println("This line should not be printed");
        }
    
}
}