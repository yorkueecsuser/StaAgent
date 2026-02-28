import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int a, int b) {
        int c = a + b;
        int[] arr = new int[10];
        boolean conditionFor = getCondition(); 
        for (int i = 0; conditionFor; i++) {
            if (i == c) {
                return arr[i];
            }
        }
        return arr[c];
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntegerOverflowExample ex = new IntegerOverflowExample();
        ex.showBug(a, b);
    }
}