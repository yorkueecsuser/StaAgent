import java.text.SimpleDateFormat;
import java.util.Date;

class BuggyDateFormat {
public static void main(String [] args){
    Date date = new SimpleDateFormat("yyyy/MM/dd" ).parse("2015/12/31");
    String result = new SimpleDateFormat("YYYY/MM/dd" ).format(date);
    result = new SimpleDateFormat("YYYY/MM/dd" ).format(date);
}
}