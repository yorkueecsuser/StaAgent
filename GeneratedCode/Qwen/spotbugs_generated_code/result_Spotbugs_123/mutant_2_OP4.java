class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
        
        // Mutated code: Adding an unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            // This block is unreachable
            result = true;
        } else {
            // This block is also unreachable due to the previous condition
            result = false;
        }
        
        return Boolean.toString(result);
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}