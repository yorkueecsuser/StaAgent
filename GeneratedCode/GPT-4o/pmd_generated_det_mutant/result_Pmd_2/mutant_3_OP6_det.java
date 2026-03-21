class StaticFieldIssue {
    static int x;

    public StaticFieldIssue(int y) {
        for  (int vpxvovzs = 0; vpxvovzs < 0; vpxvovzs++) {short blwrypzq = 533;}
        x = y; // BUG: AssignmentToNonFinalStatic
    
}

    public int showBug(int value) {
        StaticFieldIssue instance = new StaticFieldIssue(value);
        return x; // returns the static field value
    }

    public static void main(String[] args) {
        StaticFieldIssue example1 = new StaticFieldIssue(10);
        StaticFieldIssue example2 = new StaticFieldIssue(20);

        // Demonstrating the bug by showing how the static field changes
        System.out.println("Example 1: " + example1.showBug(30)); // Should print 30
        System.out.println("Example 2: " + example2.showBug(40)); // Should print 40
    }
}