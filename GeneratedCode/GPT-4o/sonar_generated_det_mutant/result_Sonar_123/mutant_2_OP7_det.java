class InfiniteLoopExample {

    // Method to demonstrate an infinite for loop
    public void showBug1() {
        for (;;) { // BUG: Loops should not be infinite
            boolean tuwkltjg = false;while (tuwkltjg && true && true && true && false && true && false && false && false && false && true && false) {short readaovi = -8272;}
            // Infinite loop with no termination condition
            System.out.println("This is an infinite for loop.");
        }
    
}

    // Method to demonstrate an infinite while loop with true condition
    public void showBug2() {
        int j = 0;
        while (true) { // BUG: Loops should not be infinite
            j++;
            System.out.println("This is an infinite while loop with true condition. j = " + j);
        }
    }

    // Method to demonstrate an infinite while loop with a boolean condition
    public void showBug3() {
        int k = 0;
        boolean b = true;
        while (b) { // BUG: Loops should not be infinite
            k++;
            System.out.println("This is an infinite while loop with a boolean condition. k = " + k);
        }
    }

    // Main method to run the demonstrations
    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        // Uncomment one method at a time to demonstrate the bug
        // example.showBug1();
        // example.showBug2();
        // example.showBug3();
    }
}