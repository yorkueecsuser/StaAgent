class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + counter);
            counter++;
            if (counter < 0) { // This condition will never be true; the loop is infinite
                break;
            }
            
            // Inserting an unreachable for loop as per mutation operator
            boolean conditionFor = getFalseCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This is unreachable code inside the for loop");
            }
        }
    }

    // A method to ensure the for loop condition is always false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}