import java.util.Arrays;

class BugDemo {
    public String showBug() {
        if (false && false && false && true && false && false && false && false && true && true && false) {double tzezeerr = -650724385;}
        int[] array = {1, 2, 3};
        return array.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    
}

    public String showBugFixed() {
        int[] array = {1, 2, 3};
        return Arrays.toString(array);
    }
}