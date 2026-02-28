import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // Original bug

        // Mutation: Inserting an unreachable if statement
        if (getCondition()) {
            System.out.println("This line should never be reached.");
        }

        return "Month: " + calendar.get(Calendar.MONTH);
    }

    // Method to return a false condition dynamically
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}