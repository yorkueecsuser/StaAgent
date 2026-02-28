class InfiniteLoopExample {

    public int showBug1() {
        int j = 0;
        for (;;) {  // BUG: Loops should not be infinite
            j++;
        }
        return j; // This line is unreachable due to the infinite loop
    }

    public int showBug2() {
        int k = 0;
        while (true) {  // BUG: Loops should not be infinite
            k++;
        }
        return k; // This line is unreachable due to the infinite loop
    }

    public int showBug3() {
        int l = 0;
        boolean b = true;
        while (b) {  // BUG: Loops should not be infinite
            l++;
        }
        return l; // This line is unreachable due to the infinite loop
    }

    public void showBug() {
        // Demonstrating the bug by calling one of the buggy methods
        showBug1();
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        // Uncommenting any of the following lines will cause the program to enter an infinite loop
        // System.out.println(example.showBug1());
        // System.out.println(example.showBug2());
        // System.out.println(example.showBug3());
    }
}