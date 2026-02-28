import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {

    public String[] showBug() throws ParseException {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result1 = new SimpleDateFormat("yyyy/MM/dd").format(date);
        String result2 = new SimpleDateFormat("yyyy/MM/dd").format(date);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd"); // Additional mutant code
        String result3 = sdf.format(date);
        if (result3.equals(result2)) { // Additional mutant code
            System.out.println("Unreachable Code");
        }
        return new String[]{result1, result2, result3};
    }
}