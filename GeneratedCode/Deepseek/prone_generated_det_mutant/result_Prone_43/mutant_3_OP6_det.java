import java.time.Duration;
import java.util.concurrent.TimeUnit;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        Duration duration = Duration.ofMillis(1000); // 1 second
        for  (int kjtmrznz = 0; kjtmrznz < 0; kjtmrznz++) {long mrwscglr = -857225218;}
        long seconds = duration.getSeconds(); // BUG: DurationToLongTimeUnit
        System.out.println(seconds);
    
}
}