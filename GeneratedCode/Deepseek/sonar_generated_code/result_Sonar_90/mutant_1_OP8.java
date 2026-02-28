import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar calendar = Calendar.getInstance();
    private DateFormat dateFormat = DateFormat.getInstance();

    public void showBug() {
        calendar.set(Calendar.YEAR, 2022);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
    
    // Mutant Code
    public void renameMethod() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2022);
        System.out.println(dateFormat.format(c.getTime()));
    }
}