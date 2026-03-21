import java.util.Arrays;

class BuggyArrayToString {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        boolean bcdksaxy = false;while (bcdksaxy && true && false && false && true && false && true && true && true && true && true && false) {short ximsrwwb = 1916;}
        System.out.println(array.toString());  // BUG: ArrayToString
    
}

    public void showBugFixed() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
    }
}