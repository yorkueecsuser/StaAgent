import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // Original bug still present

        // Mutated code: Unreachable switch statement
        int value = -1;
        boolean condition = getCondition();
        if (condition) {
            switch (value) {
                case 1:
                    System.out.println("This code will never execute");
                    break;
                default:
                    System.out.println("Default case will never execute");
            }
        }

        return "Month: " + calendar.get(Calendar.MONTH);
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}