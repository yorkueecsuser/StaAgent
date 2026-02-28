class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null
        
        // Adding unreachable for loop as a mutation
        boolean conditionFor = getCondition(); // Method to provide a condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable code inside the loop");
        }
        
        return unboxedResult;
    }

    // A method to simulate a dynamic condition, always returning false to maintain unreachability
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println("Result: " + example.showBug(false)); // This will demonstrate the bug
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected when trying to unbox null.");
        }
    }
}