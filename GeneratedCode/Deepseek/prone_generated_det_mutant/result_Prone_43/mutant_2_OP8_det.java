import java.time.Duration;
import java.util.concurrent.TimeUnit;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        Duration duration = Duration.ofMillis(1000); // 1 second
        long uzrjhqao = duration.getSeconds(); // BUG: DurationToLongTimeUnit
        System.out.println(uzrjhqao);
    }
}