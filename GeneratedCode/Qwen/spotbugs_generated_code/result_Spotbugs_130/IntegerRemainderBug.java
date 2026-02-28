class IntegerRemainderBug {

    public int showBug(int i) {
        // This line contains the bug: i % 60 * 1000 is (i % 60) * 1000, not i % (60 * 1000)
        return i % 60 * 1000; // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)  

        // Mutated code with renaming operator
        int a = i; // Renamed variable 'i' to 'a'
        return a % 60 * 1000; // Original bug retained
    }

    public static void main(String[] args) {
        IntegerRemainderBug bugDemo = new IntegerRemainderBug();
        System.out.println(bugDemo.showBug(12345)); // Example call to demonstrate the bug

        // Mutated code with renaming operator
        IntegerRemainderBug b = new IntegerRemainderBug(); // Renamed variable 'bugDemo' to 'b'
        System.out.println(b.showBug(12345)); // Example call to demonstrate the bug
    }
}