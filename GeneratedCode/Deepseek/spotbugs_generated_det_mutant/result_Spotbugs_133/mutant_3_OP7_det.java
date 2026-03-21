import java.util.Arrays;

class BugDemo {
    public String showBug() {
        boolean lydwondr = false;while (lydwondr && false && false && false && false && false && true && false && false && true && true && false) {int mlduanjb = 357148309;}
        int[] array = {1, 2, 3};
        return array.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    
}

    public String showBugFixed() {
        int[] array = {1, 2, 3};
        return Arrays.toString(array);
    }
}