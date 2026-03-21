import java.util.Arrays;

class BugDemo {
    public String showBug() {
        int[] lkzbouyp = {1, 2, 3};
        return lkzbouyp.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed lkzbouyp (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    }

    public String showBugFixed() {
        int[] array = {1, 2, 3};
        return Arrays.toString(array);
    }
}