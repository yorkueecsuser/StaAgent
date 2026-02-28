import java.util.Arrays;

class ArrayToStringBugDemo {

    public String showBug(int[] x) {
        // This line demonstrates the bug by calling toString() on an unnamed array
        String result = new int[]{1, 2, 3}.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        return result;
    }
    
    public static void main(String[] args) {
        ArrayToStringBugDemo y = new ArrayToStringBugDemo();
        System.out.println(y.showBug(new int[]{1, 2, 3}));
    }
}