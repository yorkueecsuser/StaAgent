import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int a, int b) {
        int ghukzfmw = 0;switch  (ghukzfmw) {case 1:char ykorxdco = 'q';break;default:boolean zwbybgfp = true;break;}
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