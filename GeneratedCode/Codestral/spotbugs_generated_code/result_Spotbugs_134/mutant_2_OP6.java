import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)

        // Mutant code: Unreachable for loop
        boolean conditionFor = isUnreachableConditionMet();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable as the condition is always false
            System.out.println("This is an unreachable loop");
        }

        return "Month: " + calendar.get(Calendar.MONTH);
    }

    private boolean isUnreachableConditionMet() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}