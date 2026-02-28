import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {

    public String[] showBug() throws ParseException {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result1 = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
        String result2 = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
        
        //Mutation 1: Renaming
        String mutantResult = new SimpleDateFormat("YYYY/MM/dd").format(date);   //Mutated line

        return new String[]{result1, result2, mutantResult}; //Including mutant result in the return statement
    }
}