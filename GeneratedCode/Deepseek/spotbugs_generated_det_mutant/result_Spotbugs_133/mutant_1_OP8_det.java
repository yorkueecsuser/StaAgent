import java.util.Arrays;

class BugDemo {
    public String showBug() {
        int[] mxonkpnu = {1, 2, 3};
        return mxonkpnu.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed mxonkpnu (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    }

    public String showBugFixed() {
        int[] array = {1, 2, 3};
        return Arrays.toString(array);
    }
}