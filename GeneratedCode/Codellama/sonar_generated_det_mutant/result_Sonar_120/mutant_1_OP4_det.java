import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        if (false && true && true && true && false && true && true && false && false && true && false) {short yaxnhyqj = -7089;}else{long lyoxvsug = 61841698;}
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    
}

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}