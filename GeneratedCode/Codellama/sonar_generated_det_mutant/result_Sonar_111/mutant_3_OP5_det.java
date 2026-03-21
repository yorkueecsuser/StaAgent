import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            // BUG: Loop conditions should be true at least once
            int xbuatroi = 0;switch  (xbuatroi) {case 1:float oqpryuef = 558201366;break;default:int poemgqej = 901760884;break;}
            System.out.println("This line should not be printed");
        }
    
}
}