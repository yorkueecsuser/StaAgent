class InfiniteLoopDemo {

    public void showBug1() {
        for (;;) { // BUG: Loops should not be infinite
            System.out.println("This is an infinite loop");
            // No break condition provided
        }
        
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // Condition must not be a compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop in showBug1");
        }
    }

    public void showBug2() {
        int j = 0;
        while (true) { // BUG: Loops should not be infinite
            j++;
            System.out.println("Another infinite loop, current j: " + j);
            // No break condition provided
        }
        
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // Condition must not be a compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop in showBug2");
        }
    }

    public void showBug3() {
        int k = 0;
        boolean b = true;
        while (b) { // BUG: Loops should not be infinite
            k++;
            System.out.println("Yet another infinite loop, current k: " + k);
            // 'b' is never updated within the loop
        }
        
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // Condition must not be a compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop in showBug3");
        }
    }

    private boolean getCondition() {
        // Always return false to ensure the loop is unreachable
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