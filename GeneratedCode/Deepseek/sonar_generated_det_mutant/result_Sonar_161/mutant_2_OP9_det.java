class SingleIterationLoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        { int i = 0; do { // BUG: Loops with at most one iteration should be refactored
            System.out.println("This loop will execute only once."); i++; } while (i < 1); }
    }
}