import java.util.Calendar;
import java.util.GregorianCalendar;

class BadMonthValue {

    public String showBug(int buggyMonth) {
        Calendar calendar = new GregorianCalendar(2022, buggyMonth, 1); // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        return "Month: " + calendar.get(Calendar.MONTH);
    }

    public String showMutant(int mutantMonth) { // Mutated code: Renaming the variable
        Calendar cal = new GregorianCalendar(2022, mutantMonth, 1); // Introducing a new variable name 'cal'
        return "Month: " + cal.get(Calendar.MONTH);
    }

    public static void main(String[] args) {
        BadMonthValue bmv = new BadMonthValue();
        System.out.println(bmv.showBug(12)); // Inputting 12 which is outside the expected range of 0..11
        System.out.println(bmv.showMutant(12)); // Introducing the mutant code with a new variable name
    }
}