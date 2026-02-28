class InfiniteLoopDemo {

    public void showBug1() {
        for (;;) { // BUG: Loops should not be infinite
            System.out.println("This is an infinite loop");
            // No break condition provided
            
            // Inserted unreachable switch statement
            int value = getUnreachableValue();
            switch (value) {
                case 1:
                    System.out.println("This will never be reached");
                    break;
            }
        }
    }

    public void showBug2() {
        int j = 0;
        while (true) { // BUG: Loops should not be infinite
            j++;
            System.out.println("Another infinite loop, current j: " + j);
            // No break condition provided
            
            // Inserted unreachable switch statement
            int value = getUnreachableValue();
            switch (value) {
                case 2:
                    System.out.println("This will never be reached");
                    break;
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
            
            // Inserted unreachable switch statement
            int value = getUnreachableValue();
            switch (value) {
                case 3:
                    System.out.println("This will never be reached");
                    break;
            }
        }
    }

    private int getUnreachableValue() {
        return 0; // Always returns 0, making the switch cases unreachable
    }

    public static void main(String[] args) {
        InfiniteLoopDemo demo = new InfiniteLoopDemo();
        // Uncomment one of the following lines to demonstrate each bug
        // demo.showBug1();
        // demo.showBug2();
        // demo.showBug3();
    }
}