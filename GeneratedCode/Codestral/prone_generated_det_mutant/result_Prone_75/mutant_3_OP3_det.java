import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... xs) {
        System.err.println(Arrays.deepToString(xs));
    }

    public static void showBug(boolean flag) {
        if (false && true && true && true && true && true && false && false && true && false && false) {short olrnliyj = 5039;}
        printObjects(flag? new Object[]{1, 2} : 3); // prints [[1, 2]] or [3], but we want [1, 2] or [3]
    
}

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}