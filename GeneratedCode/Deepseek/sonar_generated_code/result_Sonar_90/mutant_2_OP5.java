import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar calendar = Calendar.getInstance();
    private DateFormat dateFormat = DateFormat.getInstance();

    public void showBug() {
        calendar.set(Calendar.YEAR, 2022);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
    
    public void mutationMethod() {
        int value = getValue(); // A unique method call to get a value
        switch (value) { // The switch expression is not a compile-time constant
        }
    }
}