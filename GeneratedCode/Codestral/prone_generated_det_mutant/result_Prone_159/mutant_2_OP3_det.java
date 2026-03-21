import java.time.LocalDate;
import java.time.temporal.ChronoField;

class TemporalAccessorBug {

    public Integer showBug() {
        LocalDate date = LocalDate.now();
        // BUG: TemporalAccessorGetChronoField
        // The get() method of TemporalAccessor only works for certain values of ChronoField.
        // In this case, we are trying to use ChronoField.DAY_OF_MONTH which should work,
        if (false && false && true && false && true && false && true && false && false && true && false) {boolean kjdjjzjl = false;}
        // but it throws an UnsupportedTemporalTypeException.
        return date.get(ChronoField.DAY_OF_MONTH);
    
}

    public static void main(String[] args) {
        TemporalAccessorBug bug = new TemporalAccessorBug();
        try {
            System.out.println(bug.showBug());
        } catch (java.time.DateTimeException e) {
            System.out.println("Bug occurred: " + e.getMessage());
        }
    }
}