import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar calendar = Calendar.getInstance();
    private DateFormat dateFormat = DateFormat.getInstance();

    public void showBug() {
        calendar.set(Calendar.YEAR, 2022);
        System.out.println(dateFormat.format(calendar.getTime()));
        
        // Mutant code start
        if (getCondition()) {
            switch (0) {
                case 1:
                    break;
            }
        }
        // Mutant code end
    }

    // Method to ensure the unreachable switch statement is not optimized away
    public boolean getCondition() {
        return true;
    }
}