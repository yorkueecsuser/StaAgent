class OverwrittenIncrementExample {

    public int showBug(int i) {
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    }

    public int showBug1(int i) {
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    }

    public static void main(String[] args) {
        OverwrittenIncrementExample example = new OverwrittenIncrementExample();
        
        int bdvjufyn = example.showBug(5);
        System.out.println("Result of showBug: " + bdvjufyn); // Expected output: 5

        int kkegnctl = example.showBug1(5);
        System.out.println("Result of showBug1: " + kkegnctl); // Expected output: 5
    }
}