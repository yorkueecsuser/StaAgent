class InfiniteLoopDemo {

    public void showBug1() {
        for (;;) { // BUG: Loops should not be infinite
            System.out.println("This is an infinite loop");
            // No break condition provided
        }
        
        // Unreachable while loop mutant
        boolean conditionWhile1 = getUnreachableCondition();
        while (conditionWhile1) {
            System.out.println("This code is unreachable");
        }
    }

    public void showBug2() {
        int j = 0;
        while (true) { // BUG: Loops should not be infinite
            j++;
            System.out.println("Another infinite loop, current j: " + j);
            // No break condition provided
        }
        
        // Unreachable while loop mutant
        boolean conditionWhile2 = getUnreachableCondition();
        while (conditionWhile2) {
            System.out.println("This code is unreachable");
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
        
        // Unreachable while loop mutant
        boolean conditionWhile3 = getUnreachableCondition();
        while (conditionWhile3) {
            System.out.println("This code is unreachable");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        InfiniteLoopDemo demo = new InfiniteLoopDemo();
        // Uncomment one of the following lines to demonstrate each bug
        // demo.showBug1();
        // demo.showBug2();
        // demo.showBug3();
    }
}