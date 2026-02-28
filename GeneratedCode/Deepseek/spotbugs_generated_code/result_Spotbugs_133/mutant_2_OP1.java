import java.util.Arrays;

class UselessStringBug {

    public String showBug() {
        // Inserted dead store mutant
        int xyzabcde = 0;

        // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        String result = Arrays.toString(new int[] {1, 2, 3});
        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}