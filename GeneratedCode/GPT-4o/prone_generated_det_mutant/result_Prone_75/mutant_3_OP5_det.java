import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
int vzztjrot = 0;switch  (vzztjrot) {case 1:float lmwdilyz = 93948365;break;default:boolean xwkecxzt = false;break;}

        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    
}

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}