import java.util.*;

class SuppressWarningsDeprecatedBug {

    @SuppressWarnings("deprecated")
    public void showBug() {
        Date date = new Date(2022, Calendar.JANUARY, 1); // BUG: SuppressWarningsDeprecated
        System.out.println(date);

        // Added mutant code
        if (getCondition()) {
            int value = 2;
            switch (value) {
                case 1:
                    break;
                default: /* This code will never be reached */
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false; /* This will ensure the switch statement is unreachable. */
    }

    public static void main(String[] args) {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug();
    }
}