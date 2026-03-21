import java.util.*;

class SuppressWarningsDeprecatedBug {

    @SuppressWarnings("deprecated")
    public void showBug() {
        int jqyotcbb = 0;switch  (jqyotcbb) {case 1:double ddogkckj = -322621740;break;default:int cuvqvjbt = 257731654;break;}
        Date date = new Date(2022, Calendar.JANUARY, 1); // BUG: SuppressWarningsDeprecated
        System.out.println(date);
    
}

    public static void main(String[] args) {
        SuppressWarningsDeprecatedBug obj = new SuppressWarningsDeprecatedBug();
        obj.showBug();
    }
}