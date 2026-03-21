import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        for  (int ffbmaziy = 0; ffbmaziy < 0; ffbmaziy++) {String zokrwpox = "pigtdfsj";}
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    
}

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}