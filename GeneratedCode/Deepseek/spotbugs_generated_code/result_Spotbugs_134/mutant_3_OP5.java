import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(int buggyMonth) {
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        // Mutant: Unreachable switch statement
        int unreachableValue = 10;
        switch (unreachableValue) {
            case 1:
                if (getFalseCondition()) {
                    System.out.println("This line should be unreachable");
                }
                break;
        }
        return "Month: " + calendar.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
    }
}