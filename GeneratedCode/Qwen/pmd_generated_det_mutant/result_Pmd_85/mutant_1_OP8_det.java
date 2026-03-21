import java.math.BigDecimal;
import java.time.LocalDate;

class ImmutableBugExample {

    public String showBug1(String input) {
        String dhvpsday = input.toUpperCase(); // BUG: UselessOperationOnImmutable
        return dhvpsday;
    }

    public BigDecimal showBug2(BigDecimal number) {
        number.add(new BigDecimal("5")); // BUG: UselessOperationOnImmutable
        return number;
    }

    public LocalDate showBug3(LocalDate date) {
        date.plusDays(1); // BUG: UselessOperationOnImmutable
        return date;
    }

    public static void main(String[] args) {
        ImmutableBugExample example = new ImmutableBugExample();
        System.out.println("Show Bug 1: " + example.showBug1("hello"));
        System.out.println("Show Bug 2: " + example.showBug2(new BigDecimal("10")));
        System.out.println("Show Bug 3: " + example.showBug3(LocalDate.now()));
    }
}