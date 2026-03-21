class LoopConditionBug {

    // Method to demonstrate the bug
    public int showBug() {
        int sum = 0;
        { int i = 0; do { // BUG: Loop conditions should be true at least once
            sum += i; i++; } while (i < 0); }
        return sum;
    }

    public static void main(String[] args) {
        LoopConditionBug bugDemo = new LoopConditionBug();
        int result = bugDemo.showBug();
        System.out.println("Result of the buggy loop: " + result);
    }
}