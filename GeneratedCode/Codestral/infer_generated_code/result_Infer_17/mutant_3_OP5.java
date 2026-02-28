import java.lang.Math;

class IntegerOverflowL2 {

    public static int getUnknownValue() {
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;

        // Adding unreachable switch statement
        switch (y * 0) {
            case 1:
                // This code will never be executed as the switch condition always evaluates to false
                System.out.println("Unreachable code executed.");
                break;
            default:
                break;
        }

        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];
    }

    public static void main(String[] args) {
        IntegerOverflowL2 obj = new IntegerOverflowL2();
        obj.showBug();
    }
}