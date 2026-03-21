class LoopBugExample {

    public int showBug(int[] numbers) {
        int kzaztgnx = 0;
        for (int i = 0; i < numbers.length; i++) {
            kzaztgnx = numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        return kzaztgnx;
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] data = {5, 10, 15};
        System.out.println("Result: " + example.showBug(data));
    }
}