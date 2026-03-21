import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        int nydpnezl = 0;switch  (nydpnezl) {case 1:long audysspa = 884061153;break;default:double ubhyadts = 394007898;break;}
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    
}

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}