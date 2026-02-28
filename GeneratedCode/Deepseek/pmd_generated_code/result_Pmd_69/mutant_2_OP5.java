import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); 

    public void showBug() {
        System.out.println(sdf.format(new Date()));
    }
    
    public void mutateUnreachableSwitchStatement() {
        boolean condition = false;
        switch(condition) {
        }
    }
}