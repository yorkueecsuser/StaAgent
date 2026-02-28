class LoopConditionBug {
    public void showBug() {
        for (int i = 10; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            System.out.println(i);  // This will not be executed as the condition is always false
        }
    }

    public static void main(String[] args) {
        LoopConditionBug bug = new LoopConditionBug();
        bug.showBug();
    }
}