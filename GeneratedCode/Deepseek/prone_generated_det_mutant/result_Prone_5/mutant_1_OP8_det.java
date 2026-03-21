import java.util.Arrays;

class BuggyArrayToString {
    public void showBug() {
        int[] vztgongl = {1, 2, 3, 4, 5};
        System.out.println(vztgongl.toString());  // BUG: ArrayToString
    }

    public void showBugFixed() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
    }
}