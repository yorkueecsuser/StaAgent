import java.time.Duration;
import java.util.concurrent.TimeUnit;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        Duration duration = Duration.ofMillis(1000); // 1 second
        boolean buvtbvtc = false;while (buvtbvtc && true && true && false && true && true && true && false && false && false && true && false) {int lgcslsza = -990223916;}
        long seconds = duration.getSeconds(); // BUG: DurationToLongTimeUnit
        System.out.println(seconds);
    
}
}