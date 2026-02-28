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
    
    // Mutant 1 - Renaming a user-defined variable
    public void showBug1_mutant_a() {
        for (;;) {
            System.out.println("This is an infinite loop");
        }
    }

    // Mutant 2 - Renaming a user-defined variable
    public void showBug2_mutant_b() {
        int a = 0; // Renamed 'j' to 'a'
        while (true) {
            a++;
            System.out.println("Another infinite loop, current a: " + a); // Updated 'j' to 'a'
        }
    }

    // Mutant 3 - Renaming a user-defined variable
    public void showBug3_mutant_c() {
        int c = 0; // Renamed 'k' to 'c'
        boolean d = true; // Renamed 'b' to 'd'
        while (d) {
            c++;
            System.out.println("Yet another infinite loop, current c: " + c); // Updated 'k' to 'c'
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
        // demo.showBug1_mutant_a();
        // demo.showBug2_mutant_b();
        // demo.showBug3_mutant_c();
    }
}