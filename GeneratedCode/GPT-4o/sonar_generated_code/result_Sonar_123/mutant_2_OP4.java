class InfiniteLoopDemo {

    public void showBug1() {
        for (;;) { // BUG: Loops should not be infinite
            System.out.println("This is an infinite loop");
            // No break condition provided

            // Mutation: Inserting an unreachable if-else branch
            boolean condition1 = getFalseCondition();
            if (condition1) {
                System.out.println("This should never be printed: showBug1");
            } else {
                // This else block is actually reachable but does nothing
            }
        }
    }

    public void showBug2() {
        int j = 0;
        while (true) { // BUG: Loops should not be infinite
            j++;
            System.out.println("Another infinite loop, current j: " + j);
            // No break condition provided

            // Mutation: Inserting an unreachable if-else branch
            boolean condition2 = getFalseCondition();
            if (condition2) {
                System.out.println("This should never be printed: showBug2");
            } else {
                // This else block is actually reachable but does nothing
            }
        }
    }

    public void showBug3() {
        int k = 0;
        boolean b = true;
        while (b) { // BUG: Loops should not be infinite
            k++;
            System.out.println("Yet another infinite loop, current k: " + k);
            // 'b' is never updated within the loop

            // Mutation: Inserting an unreachable if-else branch
            boolean condition3 = getFalseCondition();
            if (condition3) {
                System.out.println("This should never be printed: showBug3");
            } else {
                // This else block is actually reachable but does nothing
            }
        }
    }

    // Method to simulate a dynamically determined false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteLoopDemo demo = new InfiniteLoopDemo();
        // Uncomment one of the following lines to demonstrate each bug
        // demo.showBug1();
        // demo.showBug2();
        // demo.showBug3();
    }
}