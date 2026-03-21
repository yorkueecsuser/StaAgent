import java.util.Arrays;

class BuggyArrayToString {
    public void showBug() {
        int[] zcotysty = {1, 2, 3, 4, 5};
        System.out.println(zcotysty.toString());  // BUG: ArrayToString
    }

    public void showBugFixed() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
    }
}