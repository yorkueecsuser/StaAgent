class InfiniteLoopDemo {

    public void showBug1() {
        for (;;) { // BUG: Loops should not be infinite
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
    }

    public void showBug3() {
        int k = 0;
        boolean b = true;
        while (b) { // BUG: Loops should not be infinite
            k++;
            System.out.println("Yet another infinite loop, current k: " + k);
            // 'b' is never updated within the loop
        }
    }

    // Mutant method with renaming
    public void showBug1_mutant() {
        for (;;) { // BUG: Loops should not be infinite
            System.out.println("This is an infinite loop");
            // No break condition provided
        }
    }

    public void showBug2_mutant() {
        int a = 0; // renaming 'j' to 'a'
        while (true) { // BUG: Loops should not be infinite
            a++;
            System.out.println("Another infinite loop, current a: " + a);
            // No break condition provided
        }
    }

    public void showBug3_mutant() {
        int c = 0; // renaming 'k' to 'c'
        boolean d = true; // renaming 'b' to 'd'
        while (d) { // BUG: Loops should not be infinite
            c++;
            System.out.println("Yet another infinite loop, current c: " + c);
            // 'd' is never updated within the loop
        }
    }

    public static void main(String[] args) {
        InfiniteLoopDemo demo = new InfiniteLoopDemo();
        // Uncomment one of the following lines to demonstrate each bug
        // demo.showBug1();
        // demo.showBug2();
        // demo.showBug3();

        // Uncomment one of the following lines to demonstrate each mutant
        // demo.showBug1_mutant();
        // demo.showBug2_mutant();
        // demo.showBug3_mutant();
    }
}