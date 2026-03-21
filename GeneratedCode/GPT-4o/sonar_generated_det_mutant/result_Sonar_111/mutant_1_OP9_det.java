class LoopConditionBugDemo {

    public int showBug() {
        int sum = 0;
        // BUG: Loop conditions should be true at least once
        { int i = 0; do { // Noncompliant: the condition is always false, and the loop will never execute
            sum += i; i++; } while (i < 0); }
        return sum;
    }

    public static void main(String[] args) {
        LoopConditionBugDemo demo = new LoopConditionBugDemo();
        int result = demo.showBug();
        System.out.println("Sum is: " + result);
    }
}