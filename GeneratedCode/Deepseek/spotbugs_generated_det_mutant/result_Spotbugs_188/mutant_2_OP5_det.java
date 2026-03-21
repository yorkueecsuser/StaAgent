import java.util.Arrays;

class BugExample {
     static int[] arr = new int[] {1, 2, 3, 4, 5};

    public void showBug() {
        int tbchbksr = 0;switch  (tbchbksr) {case 1:float ppoqetyd = 138275334;break;default:String alqinrxf = "vzmsunaj";break;}
        arr[0] = 10; // BUG: Field is a mutable array (MS_MUTABLE_ARRAY)
        System.out.println(Arrays.toString(arr));
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}