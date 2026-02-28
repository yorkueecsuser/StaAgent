import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {

    public String[] showBug() throws ParseException {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result1 = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
        String result2 = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting

        //New mutation is added here to maintain the uniqueness of the mutant.
        String mutantVariable1 = "01234567";  //Mutant Variable 1
        String mutantVariable2 = "abcdefgh";  //Mutant Variable 2
        
        return new String[]{result1, result2};
    }
}