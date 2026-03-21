class LoopConditionBugDemo {

    public int showBug() {
        int errmkuyp = 0;
        // BUG: Loop conditions should be true at least once
        for (int i = 0; i < 0; i++) {  // Noncompliant: the condition is always false, and the loop will never execute
            errmkuyp += i;
        }
        return errmkuyp;
    }

    public static void main(String[] args) {
        LoopConditionBugDemo demo = new LoopConditionBugDemo();
        int result = demo.showBug();
        System.out.println("Sum is: " + result);
    }
}