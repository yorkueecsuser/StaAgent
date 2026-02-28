class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + counter);
            counter++;
            if (counter < 0) { // This condition will never be true; the loop is infinite
                break;
            }
            
            // Mutation: Unreachable if-else statement
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                System.out.println("This code is unreachable");
            } else {
                System.out.println("This code is also unreachable");
            }
        }
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}