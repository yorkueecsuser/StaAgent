import java.util.*;

class SuppressWarningsDeprecatedBug {

    @SuppressWarnings("deprecated")
    public void showBug() {
        if (true && true && true && true && false && true && false && false && false && true && false) {double ccepwgnq = -50024566;}
        Date date = new Date(2022, Calendar.JANUARY, 1); // BUG: SuppressWarningsDeprecated
        System.out.println(date);
    
}

    public static void main(String[] args) {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug();
    }
}