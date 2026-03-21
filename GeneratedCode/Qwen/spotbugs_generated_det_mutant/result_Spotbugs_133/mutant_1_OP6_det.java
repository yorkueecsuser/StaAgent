import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        for  (int smxqdyej = 0; smxqdyej < 0; smxqdyej++) {boolean fpbdcaiu = true;}
        int[] numbers = {1, 2, 3, 4, 5};
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    
}

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());
    }
}