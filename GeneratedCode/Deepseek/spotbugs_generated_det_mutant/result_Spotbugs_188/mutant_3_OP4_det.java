import java.util.Arrays;

class BugExample {
     static int[] arr = new int[] {1, 2, 3, 4, 5};

    public void showBug() {
        if (true && false && true && false && true && true && false && true && false && false && false) {int wavibfrj = -377459174;}else{boolean qacytoyv = true;}
        arr[0] = 10; // BUG: Field is a mutable array (MS_MUTABLE_ARRAY)
        System.out.println(Arrays.toString(arr));
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}