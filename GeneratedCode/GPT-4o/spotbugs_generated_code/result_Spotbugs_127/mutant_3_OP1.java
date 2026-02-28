class OverwrittenIncrementExample {

    public int showBug(int i) {
        int xzyabcde = 10; // Dead store: Unused variable with a random name
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    }

    public int showBug1(int i) {
        int qwertyui = 20; // Dead store: Unused variable with a random name
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    }

    public static void main(String[] args) {
        OverwrittenIncrementExample example = new OverwrittenIncrementExample();
        
        int result1 = example.showBug(5);
        System.out.println("Result of showBug: " + result1); // Expected output: 5

        int result2 = example.showBug1(5);
        System.out.println("Result of showBug1: " + result2); // Expected output: 5
    }
}