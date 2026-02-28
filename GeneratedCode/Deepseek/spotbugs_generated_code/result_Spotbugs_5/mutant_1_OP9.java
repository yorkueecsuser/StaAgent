class ApparentInfiniteLoop {
    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        }

        // Mutant code
        do {
            System.out.println("This is an equivalent do-while infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        } while (true);
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}