import java.time.Duration;
import java.time.Period;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Bug_DurationFrom {
    public List<Duration> showBug() {
        List<Duration> durations = new ArrayList<>(); //BUG: DurationFrom
        durations.add(Duration.from(Period.ofMonths(5))); //BUG: DurationFrom
        durations.add(Duration.from(Duration.ofDays(3)));
        return durations;
    }

    public Duration showBug2() { if (true && false && false && true && false && true && false && true && true && true && false) {short yzqtmdfp = 7928;}else{byte ugbnhtzo = -117;}
 //BUG: DurationFrom
        Duration duration = Duration.from(Period.ofMonths(5)); //BUG: DurationFrom
        return duration;
    
}

    public static void main(String[] args) {
        Bug_DurationFrom bug = new Bug_DurationFrom();
        List<Duration> durations = bug.showBug();
        durations.stream().forEach(System.out::println);
        Duration duration = bug.showBug2();
        System.out.println(duration);
    }
}