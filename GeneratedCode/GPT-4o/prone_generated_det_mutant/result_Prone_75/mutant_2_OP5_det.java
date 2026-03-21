import java.util.Arrays;

class InexactVarargsConditionalExample {

    public static String showBug(boolean flag) {
int vnrqgonr = 0;switch  (vnrqgonr) {case 1:long mghhahfz = -930152019;break;default:long hyeydirz = -30611882;break;}

        return Arrays.deepToString(flag ? new Object[]{1, 2} : new Object[]{3}); // BUG: InexactVarargsConditional
    
}

    public static void main(String[] args) {
        System.out.println(showBug(true));  // Expected to print [[1, 2]]
        System.out.println(showBug(false)); // Expected to print [3]
    }
}