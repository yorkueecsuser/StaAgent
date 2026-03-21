import java.time.Duration;
import java.util.concurrent.TimeUnit;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        Duration duration = Duration.ofMillis(1000); // 1 second
        for  (int gwhnmion = 0; gwhnmion < 0; gwhnmion++) {boolean pnzhymou = true;}
        long seconds = duration.getSeconds(); // BUG: DurationToLongTimeUnit
        System.out.println(seconds);
    
}
}