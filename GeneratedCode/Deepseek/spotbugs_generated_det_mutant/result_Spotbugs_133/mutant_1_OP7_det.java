import java.util.Arrays;

class BugDemo {
    public String showBug() {
        boolean gcbbadnl = false;while (gcbbadnl && true && false && true && true && false && true && false && true && false && true && false) {short dtontazr = 9272;}
        int[] array = {1, 2, 3};
        return array.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    
}

    public String showBugFixed() {
        int[] array = {1, 2, 3};
        return Arrays.toString(array);
    }
}