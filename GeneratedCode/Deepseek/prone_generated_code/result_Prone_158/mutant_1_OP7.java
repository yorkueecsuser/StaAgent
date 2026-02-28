import java.util.*;

class SuppressWarningsDeprecatedBug {

    @SuppressWarnings("deprecated")
    public void showBug() {
        Date date = new Date(2022, Calendar.JANUARY, 1); // BUG: SuppressWarningsDeprecated
        System.out.println(date);

        // Unreachable While Loop Mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("Unreachable loop");
            conditionWhile = false;
        }
    }

    public static void main(String[] args) {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug();
    }

    // Helper method to get the condition for mutation
    private boolean getCondition() {
        return false;
    }
}