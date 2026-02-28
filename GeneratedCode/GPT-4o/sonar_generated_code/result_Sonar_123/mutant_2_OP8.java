class InfiniteLoopDemo {

    public void showBug1() {
        // Original Code
        for (;;) { // BUG: Loops should not be infinite
            System.out.println("This is an infinite loop");
            // No break condition provided
        }
        
        // Mutated Code
        for (;;) { // Renaming mutation applied
            System.out.println("This is an infinite loop");
            // No break condition provided
        }
    }

    public void showBug2() {
        int j = 0;
        while (true) { // BUG: Loops should not be infinite
            j++;
            System.out.println("Another infinite loop, current j: " + j);
            // No break condition provided
        }
        
        // Mutated Code
        int x = 0; // Renaming j to x
        while (true) {
            x++; // Using x instead of j
            System.out.println("Another infinite loop, current x: " + x);
            // No break condition provided
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
        
        // Mutated Code
        int y = 0; // Renaming k to y
        boolean b2 = true; // Renaming b to b2
        while (b2) {
            y++; // Using y instead of k
            System.out.println("Yet another infinite loop, current y: " + y);
            // 'b2' is never updated within the loop
        }
    }

    public static void main(String[] args) {
        InfiniteLoopDemo demo = new InfiniteLoopDemo();
        // Uncomment one of the following lines to demonstrate each bug
        // demo.showBug1();
        // demo.showBug2();
        // demo.showBug3();
    }
}