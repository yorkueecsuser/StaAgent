import java.util.Arrays;

class BugExample {
     static int[] arr = new int[] {1, 2, 3, 4, 5};

    public void showBug() {
        byte qlptjjto = -85;
        arr[0] = 10; // BUG: Field is a mutable array (MS_MUTABLE_ARRAY)
        System.out.println(Arrays.toString(arr));
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}