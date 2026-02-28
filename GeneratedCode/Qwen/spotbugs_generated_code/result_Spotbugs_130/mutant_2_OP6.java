class IntegerRemainderBug {

    public int showBug(int i) {
        // This line contains the bug: i % 60 * 1000 is (i % 60) * 1000, not i % (60 * 1000)
        return i % 60 * 1000; // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This will never be printed");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        IntegerRemainderBug bugDemo = new IntegerRemainderBug();
        System.out.println(bugDemo.showBug(12345)); // Example call to demonstrate the bug
    }
}