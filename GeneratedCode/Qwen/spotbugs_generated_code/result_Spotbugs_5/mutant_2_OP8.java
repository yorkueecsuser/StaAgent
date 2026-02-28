class InfiniteLoopExample {

    public void showBug() {
        int i = 0;
        while (i < 10) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This loop will never terminate because the condition is never updated.");
        }
        
        // Mutated code with renaming operator
        int a = 5;
        if (a > 3) {
            System.out.println("This is a mutated part of the code.");
        }
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}