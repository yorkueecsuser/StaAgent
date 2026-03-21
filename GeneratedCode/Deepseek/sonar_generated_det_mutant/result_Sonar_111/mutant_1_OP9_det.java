class LoopConditionBug {
    public void showBug() {
        { int i = 0; do { // BUG: Loop conditions should be true at least once
            System.out.println("This line of code should never be executed"); i++; } while (i < 0); }
    }
}