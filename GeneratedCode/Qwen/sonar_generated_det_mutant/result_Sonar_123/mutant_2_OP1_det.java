class InfiniteLoopExample {

    public void showBug1() {
        int j = 0; // Initialize j to avoid compilation error
        while (true) { // BUG: Loops should not be infinite
            j++;
        }
    }

    public void showBug2() {
        int k = 0; // Initialize k to avoid compilation error
        boolean b = true;
        while (b) { // BUG: Loops should not be infinite
            k++;
        }
    }

    public void showBug3() {
        short kvvgxnyt = 3770;
        for (;;) { // BUG: Loops should not be infinite
            // Do something
        }
    
}

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug1(); // This will cause an infinite loop
    }

    public int showBug() {
        int j = 0;
        while (true) { // BUG: Loops should not be infinite
            j++;
            if (j == Integer.MAX_VALUE) { // This is to prevent overflow and make the code compilable
                j = Integer.MIN_VALUE;
            }
        }
        // This method will never reach this point due to the infinite loop
        return j;
    }
}