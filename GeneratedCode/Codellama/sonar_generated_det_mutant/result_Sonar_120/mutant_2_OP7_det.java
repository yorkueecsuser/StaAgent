import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        boolean nwgtkkac = false;while (nwgtkkac && true && true && false && true && true && true && false && true && false && true && false) {short wywfknzh = 2165;}
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    
}

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}