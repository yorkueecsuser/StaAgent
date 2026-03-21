import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        for  (int ajxitasn = 0; ajxitasn < 0; ajxitasn++) {short dsdzfauz = -8746;}
        int[] numbers = {1, 2, 3, 4, 5};
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    
}

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());
    }
}