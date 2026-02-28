import java.util.*;

class SuppressWarningsDeprecatedBug {
    private boolean getCondition() {
        return false;
    }

    @SuppressWarnings("deprecated")
    public void showBug() {
        Date date = new Date(2022, Calendar.JANUARY, 1); // BUG: SuppressWarningsDeprecated
        System.out.println(date);
        if (getCondition()) {
            System.out.println("Unreachable code");
        }
    }

    public static void main(String[] args) {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug();
    }
}