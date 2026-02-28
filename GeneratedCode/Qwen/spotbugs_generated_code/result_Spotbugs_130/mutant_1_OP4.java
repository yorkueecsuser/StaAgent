class IntegerRemainderBug {

    public int showBug(int i) {
        // This line contains the bug: i % 60 * 1000 is (i % 60) * 1000, not i % (60 * 1000)
        return i % 60 * 1000; // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)

        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() always returns false
            System.out.println("This is an unreachable if block");
        } else {
            // This block will also never execute because getCondition() always returns false
            System.out.println("This is an unreachable else block");
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the if-else block is unreachable
        return false;
    }

    public static void main(String[] args) {
        IntegerRemainderBug bugDemo = new IntegerRemainderBug();
        System.out.println(bugDemo.showBug(12345)); // Example call to demonstrate the bug
    }
}