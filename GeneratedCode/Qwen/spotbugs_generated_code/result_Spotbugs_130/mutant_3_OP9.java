class IntegerRemainderBug {

    public int showBug(int i) {
        // This line contains the bug: i % 60 * 1000 is (i % 60) * 1000, not i % (60 * 1000)
        return i % 60 * 1000; // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)      
    }

    public int demonstrateBugWithLoop(int j) {
        int result = 0;
        int k = 0;
        do {
            result = j % 60 * 1000; // Introducing a loop with the same bug
            k++;
        } while (k < 1); // Ensuring the loop runs only once
        return result;
    }

    public static void main(String[] args) {
        IntegerRemainderBug bugDemo = new IntegerRemainderBug();
        System.out.println(bugDemo.showBug(12345)); // Example call to demonstrate the bug
        System.out.println(bugDemo.demonstrateBugWithLoop(12345)); // Additional call to demonstrate the bug with a loop
    }
}