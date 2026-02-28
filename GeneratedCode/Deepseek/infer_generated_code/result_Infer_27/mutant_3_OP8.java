import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int a, int b) {
        int c = a + b;
        int[] arr = new int[10];
        return arr[c];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int variable1 = sc.nextInt();
        int variable2 = sc.nextInt();
        IntegerOverflowExample ex = new IntegerOverflowExample();
        ex.showBug(variable1, variable2);
    }
}