import java.util.Arrays;

class BuggyArrayToString {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        boolean pebfwncw = false;while (pebfwncw && true && false && false && false && true && true && false && false && false && true && false) {byte bwpaeqyq = 127;}
        System.out.println(array.toString());  // BUG: ArrayToString
    
}

    public void showBugFixed() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
    }
}