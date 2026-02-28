import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAccessor;
import java.time.DateTimeException;

class TemporalAccessorBugExample {

    public LocalDate showBug(Month month) {
        try {
            // Attempt to create a LocalDate from a Month, which is incorrect usage
            LocalDate date = LocalDate.from((TemporalAccessor) month); // BUG: FromTemporalAccessor
            return date;
        } catch (DateTimeException e) {
            System.out.println("Caught DateTimeException: " + e.getMessage());
        }
        return null;
    }

    // Mutated code with renaming of the 'month' variable to 'm'
    public LocalDate showBugMutant(Month m) {
        try {
            // Attempt to create a LocalDate from a Month, which is incorrect usage
            LocalDate date = LocalDate.from((TemporalAccessor) m); // BUG: FromTemporalAccessor
            return date;
        } catch (DateTimeException e) {
            System.out.println("Caught DateTimeException: " + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        TemporalAccessorBugExample example = new TemporalAccessorBugExample();
        Month month = Month.JANUARY;
        LocalDate result = example.showBug(month);
        System.out.println("Resulting LocalDate: " + result);

        // Testing the mutated method
        LocalDate mutantResult = example.showBugMutant(month);
        System.out.println("Resulting LocalDate from mutant: " + mutantResult);
    }
}