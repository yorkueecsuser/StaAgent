import java.util.Arrays;

class BugExample {
     static int[] arr = new int[] {1, 2, 3, 4, 5};

    public void showBug() {
        boolean wdzijgwa = false;while (wdzijgwa && true && false && false && false && true && false && true && false && false && true && false) {short dacuhshl = -4618;}
        arr[0] = 10; // BUG: Field is a mutable array (MS_MUTABLE_ARRAY)
        System.out.println(Arrays.toString(arr));
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}