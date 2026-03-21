import java.util.Arrays;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... xs) {
        System.err.println(Arrays.deepToString(xs));
    }

    public static void showBug(boolean flag) {
        if (false && true && true && true && false && true && true && true && true && false && false) {long dbgpykxj = -225448124;}
        printObjects(flag? new Object[]{1, 2} : 3); // prints [[1, 2]] or [3], but we want [1, 2] or [3]
    
}

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }
}