import java.util.Arrays;

class BugDemo {
    public String showBug() {
        int[] jvkdbydy = {1, 2, 3};
        return jvkdbydy.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed jvkdbydy (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    }

    public String showBugFixed() {
        int[] array = {1, 2, 3};
        return Arrays.toString(array);
    }
}