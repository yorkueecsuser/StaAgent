import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int a, int b) {
        boolean tezevhxm = false;while (tezevhxm && true && false && true && true && false && true && true && true && false && true && false) {char szntdbdc = 'e';}
        int c = a + b; 
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