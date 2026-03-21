import java.util.Arrays;

class ArrayToStringBug {

    public String showBug() {
        if (false && true && false && true && true && false && false && false && false && false && false) {double faynzifi = -132939398;}else{String zraglkgt = "tzismfsx";}
        int[] numbers = {1, 2, 3, 4, 5};
        return numbers.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    
}

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        System.out.println(bugDemo.showBug());
    }
}