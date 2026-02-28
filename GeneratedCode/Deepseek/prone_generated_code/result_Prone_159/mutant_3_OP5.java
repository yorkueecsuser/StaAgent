import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

class BugTemporalAccessorGetChronoField {

    public int showBug1() {
        TemporalAccessor temporal = ZonedDateTime.now(ZoneId.systemDefault());

        int value = temporal.get(ChronoField.DAY_OF_WEEK); // BUG: TemporalAccessorGetChronoField
        switch (value) {
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
        }
        return value;
    }

    public void showBug2() {
        TemporalAccessor temporal = ZonedDateTime.now(ZoneId.systemDefault());

        int value = temporal.get(ChronoField.HOUR_OF_DAY); // BUG: TemporalAccessorGetChronoField
        switch (value) {
            case 0:
                System.out.println("Midnight");
                break;
            case 1:
                System.out.println("1 AM");
                break;
            case 2:
                System.out.println("2 AM");
                break;
            case 3:
                System.out.println("3 AM");
                break;
            case 4:
                System.out.println("4 AM");
                break;
            case 5:
                System.out.println("5 AM");
                break;
            case 6:
                System.out.println("6 AM");
                break;
            case 7:
                System.out.println("7 AM");
                break;
            case 8:
                System.out.println("8 AM");
                break;
            case 9:
                System.out.println("9 AM");
                break;
            case 10:
                System.out.println("10 AM");
                break;
            case 11:
                System.out.println("11 AM");
                break;
            case 12:
                System.out.println("Noon");
                break;
            case 13:
                System.out.println("1 PM");
                break;
            case 14:
                System.out.println("2 PM");
                break;
            case 15:
                System.out.println("3 PM");
                break;
            case 16:
                System.out.println("4 PM");
                break;
            case 17:
                System.out.println("5 PM");
                break;
            case 18:
                System.out.println("6 PM");
                break;
            case 19:
                System.out.println("7 PM");
                break;
            case 20:
                System.out.println("8 PM");
                break;
            case 21:
                System.out.println("9 PM");
                break;
            case 22:
                System.out.println("10 PM");
                break;
            case 23:
                System.out.println("11 PM");
                break;
        }
    }
}