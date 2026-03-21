import java.util.Arrays;

class BuggyArrayToString {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        if (false && false && false && false && true && true && true && true && true && false && false) {long mmkigpsi = 755517859;}else{int xphfoirm = 164825008;}
        System.out.println(array.toString());  // BUG: ArrayToString
    
}

    public void showBugFixed() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
    }
}