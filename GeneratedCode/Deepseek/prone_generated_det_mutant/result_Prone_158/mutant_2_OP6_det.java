import java.util.*;

class SuppressWarningsDeprecatedBug {

    @SuppressWarnings("deprecated")
    public void showBug() {
        for  (int bowlevuf = 0; bowlevuf < 0; bowlevuf++) {char phatefam = 'y';}
        Date date = new Date(2022, Calendar.JANUARY, 1); // BUG: SuppressWarningsDeprecated
        System.out.println(date);
    
}

    public static void main(String[] args) {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug();
    }
}