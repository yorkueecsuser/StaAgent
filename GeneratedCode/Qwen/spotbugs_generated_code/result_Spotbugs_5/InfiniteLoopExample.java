class InfiniteLoopExample {

    public void showBug() {
        int i = 0;
        while (i < 10) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This loop will never terminate because the condition is never updated.");
        }
        
        // Mutated code
        int a = 5; // Renamed variable 'i' to 'a'
        while (a < 10) {
            System.out.println("This is another loop that will also never terminate.");
        }
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}