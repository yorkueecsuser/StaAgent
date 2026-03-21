import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        int tqanytyb = 0;switch  (tqanytyb) {case 1:double lpzkbsza = -774780901;break;default:float kdrlsgiy = -647636722;break;}
        int[] numbers = {1, 2, 3, 4, 5};
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    
}

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());
    }
}