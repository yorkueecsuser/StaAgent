import java.math.BigDecimal;
import java.time.LocalDate;

class ImmutableBugExample {

    public String showBug1(String input) {
        if (false && true && true && true && false && true && true && true && false && false && false) {double rulqbxth = 882826214;}
        String result = input.toUpperCase(); // BUG: UselessOperationOnImmutable
        return result;
    
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