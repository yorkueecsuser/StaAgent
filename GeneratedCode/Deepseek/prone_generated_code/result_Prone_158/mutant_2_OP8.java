import java.util.*;

class SuppressWarningsDeprecatedBug {

    @SuppressWarnings("deprecated")
    public void showBug() {
        Date date = new Date(2022, Calendar.JANUARY, 1); // BUG: SuppressWarningsDeprecated
        System.out.println(date);
    }

    public void mutationRenaming() {
        Date renamed_date = new Date(2022, Calendar.JANUARY, 1); // Mutation: Renaming variable "date" to "renamed_date"
        System.out.println(renamed_date);
    }

    public static void main(String[] args) {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug();
        obj.mutationRenaming();
    }
}