import java.util.*;

class SuppressWarningsDeprecatedBug {

    @SuppressWarnings("deprecated")
    public void showBug() {
        Date date = new Date(2022, Calendar.JANUARY, 1); // BUG: SuppressWarningsDeprecated
        System.out.println(date);
        int shouldRun = 0;
        if (shouldRun == 1) {
            // This code will never be executed because the condition is always false.
            System.out.println("This code is unreachable.");
        } else {
            // This code is reachable because the condition is always false.
            System.out.println("This code is reachable.");
        }
    }

    public static void main(String[] args) {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug();
    }
}