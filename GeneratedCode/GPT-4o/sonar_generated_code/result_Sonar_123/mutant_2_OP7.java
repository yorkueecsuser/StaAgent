class InfiniteLoopDemo {

    public void showBug1() {
        for (;;) { // BUG: Loops should not be infinite
            System.out.println("This is an infinite loop");
            // No break condition provided
        }
        boolean conditionWhileBug1 = getCondition();
        while (conditionWhileBug1) { // Unreachable while loop
            System.out.println("This code is unreachable in showBug1");
        }
    }

    public void showBug2() {
        int j = 0;
        while (true) { // BUG: Loops should not be infinite
            j++;
            System.out.println("Another infinite loop, current j: " + j);
            // No break condition provided
        }
        boolean conditionWhileBug2 = getCondition();
        while (conditionWhileBug2) { // Unreachable while loop
            System.out.println("This code is unreachable in showBug2");
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
        boolean conditionWhileBug3 = getCondition();
        while (conditionWhileBug3) { // Unreachable while loop
            System.out.println("This code is unreachable in showBug3");
        }
    }

    private boolean getCondition() {
        return false; // This method is used to ensure the condition is not compile-time constant
    }

    public static void main(String[] args) {
        InfiniteLoopDemo demo = new InfiniteLoopDemo();
        // Uncomment one of the following lines to demonstrate each bug
        // demo.showBug1();
        // demo.showBug2();
        // demo.showBug3();
    }
}