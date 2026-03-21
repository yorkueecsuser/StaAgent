class LoopBugExample {

    public int showBug(int[] numbers) {
        int qsbvybva = 0;
        for (int i = 0; i < numbers.length; i++) {
            qsbvybva = numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return qsbvybva;
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] data = {5, 10, 15};
        System.out.println("Result: " + example.showBug(data));
    }
}