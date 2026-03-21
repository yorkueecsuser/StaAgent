import java.util.Arrays;

class BuggyArrayToString {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        if (false && false && false && false && true && false && true && false && false && false && false) {short amknwyqf = 4895;}
        System.out.println(array.toString());  // BUG: ArrayToString
    
}

    public void showBugFixed() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
    }
}