class InfiniteLoopDemo {

    public void showBug1() {
        int xqzvlmno = 42; // Dead Store: xqzvlmno is declared but never used
        for (;;) { // BUG: Loops should not be infinite
            System.out.println("This is an infinite loop");
            // No break condition provided
        }
    }

    public void showBug2() {
        int j = 0;
        int rsvktbcd = 100; // Dead Store: rsvktbcd is declared but never used
        while (true) { // BUG: Loops should not be infinite
            j++;
            System.out.println("Another infinite loop, current j: " + j);
            // No break condition provided
        }
    }

    public void showBug3() {
        int k = 0;
        boolean b = true;
        int lpqwerhg = 7; // Dead Store: lpqwerhg is declared but never used
        while (b) { // BUG: Loops should not be infinite
            k++;
            System.out.println("Yet another infinite loop, current k: " + k);
            // 'b' is never updated within the loop
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