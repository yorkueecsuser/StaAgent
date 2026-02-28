class ApparentInfiniteLoop {
    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        }

        // Mutated code
        int loopVariable = 0;
        while (loopVariable < 10) {
            System.out.println("This is a finite loop.");
            loopVariable++;
        }
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}