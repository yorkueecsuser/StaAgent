import java.util.*;

class SuppressWarningsDeprecatedBug {

    @SuppressWarnings("deprecated")
    public void showBug() {
        Date date = new Date(2022, Calendar.JANUARY, 1); // Original code
        System.out.println(date);

        // Mutant code
        boolean alwaysFalse = getAlwaysFalse();
        if (alwaysFalse) { // This is an unreachable if statement, due to 'alwaysFalse' being always false
            System.out.println("This is unreachable code");
        }
    }

    // Method to return always false regardless of the input
    public boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug();
    }
}