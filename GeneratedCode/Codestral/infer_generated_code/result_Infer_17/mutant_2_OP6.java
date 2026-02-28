// Mutated Java code with Unreachable for loop mutation operator
class IntegerOverflowL2 {

    public static int getUnknownValue() {
        // Simulate unknown method
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public boolean getCondition() {
        // Simulate unknown method that returns a boolean value
        return false;
    }

    public int showBug() {
        int x = getUnknownValue();
        int y = x + 2000000000;  // Potential integer overflow

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code block will never be executed
            System.out.println("Unreachable code block");
        }

        int[] arr = new int[10];
        return arr[Math.abs(y % 10)];  // Array index might be out of bounds due to integer overflow
    }

    public static void main(String[] args) {
        IntegerOverflowL2 obj = new IntegerOverflowL2();
        obj.showBug();
    }
}