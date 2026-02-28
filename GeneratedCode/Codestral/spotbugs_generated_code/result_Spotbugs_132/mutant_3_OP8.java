import java.util.Arrays;

class UselessStringBug {
    public String showBug() {
        int[] arr = {1, 2, 3, 4, 5}; // Renamed 'array' to 'arr'
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return arr.toString(); // Reflected the name change
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}