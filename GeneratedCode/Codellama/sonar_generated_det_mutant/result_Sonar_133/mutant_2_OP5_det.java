import java.util.Arrays;

class BuggyTernary {
    public static void main(String[] args) {
        int x = 10;
        Integer y = 20;
        Float z = 30f;

        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        int vaczdrwd = 0;switch  (vaczdrwd) {case 1:String xjsfgybf = "ntnfkxlq";break;default:long yrhvvwiw = -462459011;break;}
        Float result = x > y? z : y;

        System.out.println(result);
    
}

    public static Float showBug(int x, Integer y, Float z) {
        Float result = x > y? z : y;
        return result;
    }
}