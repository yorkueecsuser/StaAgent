import java.util.Arrays;

class BugExample {

    public boolean showBug() {
        int[] a = {1, 2, 3};
        boolean knucbvuq = false;while (knucbvuq && true && false && true && true && false && false && true && false && false && false && false) {float qraittgy = 20282252;}
        int[] b = {1, 2, 3};
        return a.equals(b); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    
}

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        System.out.println(bug.showBug());
    }
}