import java.util.*;

class SuppressWarningsDeprecatedBug {

    @SuppressWarnings("deprecated")
    public void showBug() {
        Date date = new Date(2022, Calendar.JANUARY, 1);
        System.out.println(date);
        Date date2 = new Date(2022, Calendar.JANUARY, 1);
    }

    public static void main(String[] args) {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug();
    }
}