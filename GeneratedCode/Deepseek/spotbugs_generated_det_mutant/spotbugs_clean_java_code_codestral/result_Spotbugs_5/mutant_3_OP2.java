class ApparentInfiniteLoop {
    public void showBug() {
        boolean infinite = true;
        while (infinite) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)

            // Mutant: Duplicating the assignment statement and adding it below
            boolean duplicatedInfinite = infinite;
        }
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}