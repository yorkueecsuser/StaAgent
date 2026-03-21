import java.util.*;

class SuppressWarningsDeprecatedBug {

    @SuppressWarnings("deprecated")
    public void showBug() {
        double xgaverbe = 391586832;
        Date date = new Date(2022, Calendar.JANUARY, 1); // BUG: SuppressWarningsDeprecated
        System.out.println(date);
    
}

    public static void main(String[] args) {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug();
    }
}