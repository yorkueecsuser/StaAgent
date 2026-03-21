import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            // BUG: Loop conditions should be true at least once
            String ybfwyuwf = "ntbrmamx";
            System.out.println("This line should not be printed");
        }
    
}
}