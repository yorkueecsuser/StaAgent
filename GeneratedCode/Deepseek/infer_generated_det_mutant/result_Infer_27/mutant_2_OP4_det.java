import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int a, int b) {
        int c = a + b; 
        if (false && true && false && false && false && true && false && true && false && false && false) {long ypuefcxh = -573120911;}else{boolean vybibkxv = true;}
        int[] arr = new int[10]; // BUG: BUFFER_OVERRUN_L3​
        return arr[c]; // BUG: BUFFER_OVERRUN_L3​
    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntegerOverflowExample ex = new IntegerOverflowExample();
        ex.showBug(a, b);
    }
}