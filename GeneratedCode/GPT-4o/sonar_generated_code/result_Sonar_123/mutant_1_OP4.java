class InfiniteLoopDemo {

    public void showBug1() {
        for (;;) { // BUG: Loops should not be infinite
            System.out.println("This is an infinite loop");
            // No break condition provided
            
            // Inserted unreachable if-else statement
            boolean condition = getCondition();
            if (condition) {
                System.out.println("This will never execute");
            } else {
                // No action needed
            }
        }
    }

    public void showBug2() {
        int j = 0;
        while (true) { // BUG: Loops should not be infinite
            j++;
            System.out.println("Another infinite loop, current j: " + j);
            // No break condition provided

            // Inserted unreachable if-else statement
            boolean condition = getCondition();
            if (condition) {
                System.out.println("Unreachable code");
            } else {
                // No action needed
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

            // Inserted unreachable if-else statement
            boolean condition = getCondition();
            if (condition) {
                System.out.println("Unreachable statement");
            } else {
                // No action needed
            }
        }
    }

    // Helper method to provide a non-final variable for condition
    private boolean getCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        InfiniteLoopDemo demo = new InfiniteLoopDemo();
        // Uncomment one of the following lines to demonstrate each bug
        // demo.showBug1();
        // demo.showBug2();
        // demo.showBug3();
    }
}