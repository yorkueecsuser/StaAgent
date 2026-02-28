import java.util.Arrays;

class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    }

    // Equivalent Loop Replacement: Adding an equivalent do-while loop
    public void dummyLoop() {
        int i = 0;
        do {
            // The loop's body is empty as per the original code
            i++;
        } while (i < 5);
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
        bug.dummyLoop();
    }
}