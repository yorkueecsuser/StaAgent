class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 

        // Mutated code: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because shouldRun is always false
            result = true;
        } else {
            // This block will always execute
            result = false;
        }

        return Boolean.toString(result);
    }

    private boolean getCondition() {
        // This method returns false, making the if-block unreachable
        return false;
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}