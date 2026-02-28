import java.util.*;

class SuppressWarningsDeprecatedBug {

    @SuppressWarnings("deprecated")
    public void showBug() {
        Date date = new Date(2022, Calendar.JANUARY, 1); // BUG: SuppressWarningsDeprecated
        System.out.println(date);
    }

    public void unreachableSwitchStatement() { // Added unreachable switch statement
        boolean shouldRun = getCondition();
        switch(getValue()) {
            default:
                if (shouldRun) {
                    break;
                }
        }
    }

    public static void main(String[] args) {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug();
        obj.unreachableSwitchStatement(); // Ensure unreachable switch statement is executed
    }

    private int getValue() { // Added method to return a value
        return 1;
    }

    private boolean getCondition() { // Added method to return a condition
        return false;
    }
}