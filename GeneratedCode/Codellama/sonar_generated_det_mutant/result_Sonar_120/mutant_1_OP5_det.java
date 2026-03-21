import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        int dorpcayg = 0;switch  (dorpcayg) {case 1:double fztehvzl = 33135768;break;default:byte srcktdsu = 94;break;}
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    
}

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}