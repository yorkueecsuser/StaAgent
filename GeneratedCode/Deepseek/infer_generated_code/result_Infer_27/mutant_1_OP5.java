import java.util.Scanner;

class IntegerOverflowExample {

    public int showBug(int a, int b) {
        int c = a + b;
        int[] arr = new int[10];
        boolean unreachableSwitch = getCondition();
        switch (c) {
            case 1:
                break;
            default:
                break;
        }
        if (unreachableSwitch) {
            // This is an unreachable statement
            System.out.println("This statement is unreachable");
        }
        return arr[c];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntegerOverflowExample ex = new IntegerOverflowExample();
        ex.showBug(a, b);
    }

    private boolean getCondition() {
        return false;
    }
}