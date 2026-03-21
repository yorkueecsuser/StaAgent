import java.util.Arrays;

class BuggyTernary {
    public static void main(String[] args) {
        int x = 10;
        Integer y = 20;
        Float z = 30f;

        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        int zqbbxgfe = 0;switch  (zqbbxgfe) {case 1:long hrfaxebu = -534026592;break;default:float nqxudxga = -594364958;break;}
        Float result = x > y? z : y;

        System.out.println(result);
    
}

    public static Float showBug(int x, Integer y, Float z) {
        Float result = x > y? z : y;
        return result;
    }
}