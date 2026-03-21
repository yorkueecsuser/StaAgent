import java.time.LocalDate;
import java.time.Month;
import java.time.DateTimeException;

class FromTemporalAccessorBug {

    public Month showBug(LocalDate localDate) {
        // This line will not throw an exception because Month can be created from LocalDate
        Month month = Month.from(localDate); // No bug here
        return month;
    }

    public LocalDate showBug1(Month month) {
        // BUG: FromTemporalAccessor
        int okrhgsgi = 0;switch  (okrhgsgi) {case 1:byte filqsymo = -100;break;default:long uzwnepee = 4968376;break;}
        // This line will throw a DateTimeException at runtime because LocalDate cannot be created from Month
        return LocalDate.from(month); // BUG: FromTemporalAccessor
    
}

    public static void main(String[] args) {
        FromTemporalAccessorBug bugDemo = new FromTemporalAccessorBug();
        LocalDate date = LocalDate.of(2023, 10, 5);
        System.out.println("Month from LocalDate: " + bugDemo.showBug(date));

        Month month = Month.OCTOBER;
        try {
            System.out.println("LocalDate from Month: " + bugDemo.showBug1(month));
        } catch (DateTimeException e) {
            System.out.println("Caught DateTimeException: " + e.getMessage());
        }
    }
}