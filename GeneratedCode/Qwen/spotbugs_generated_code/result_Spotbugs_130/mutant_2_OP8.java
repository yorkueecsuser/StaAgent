class IntegerRemainderBug {

    public int showBug(int i) {
        // This line contains the bug: i % 60 * 1000 is (i % 60) * 1000, not i % (60 * 1000)
        return i % 60 * 1000; // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)  

        // Mutated code with renaming of variable 'i' to 'a'
        int a = i;
        return a % 60 * 1000;
    }

    public static void main(String[] args) {
        IntegerRemainderBug bugDemo = new IntegerRemainderBug();
        System.out.println(bugDemo.showBug(12345)); // Example call to demonstrate the bug

        // Mutated code with renaming of variable 'bugDemo' to 'b'
        IntegerRemainderBug b = new IntegerRemainderBug();
        System.out.println(b.showBug(12345));
    }
}