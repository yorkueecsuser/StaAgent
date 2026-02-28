import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int a, int b) {
        int c = a + b; 
        int[] arr = new int[10]; // BUG: BUFFER_OVERRUN_L3​
        
        int i = 0;
        if (i < arr.length) {
            do {
                if (i == c) {
                    return arr[i]; // BUG: BUFFER_OVERRUN_L3​
                }
                i++;
            } while (i < arr.length);
        }
        return arr[0]; // this is to avoid unreachable statement error
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntegerOverflowExample ex = new IntegerOverflowExample();
        ex.showBug(a, b);
    }
}