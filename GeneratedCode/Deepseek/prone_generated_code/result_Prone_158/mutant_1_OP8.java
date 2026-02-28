import java.util.*;

class BugSuppressWarningsDeprecated {

    @SuppressWarnings("deprecated")
    public void showBug() {
        Date d = new Date(2022, Calendar.JANUARY, 1); // Mutated Date variable name
        System.out.println(d);
    }

    public static void main(String[] args) {
        BugSuppressWarningsDeprecated obj = new BugSuppressWarningsDeprecated();
        obj.showBug();
    }
}