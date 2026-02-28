class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
        
        // Mutant: Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
            System.out.println("This loop should never execute");
        }
        
        return Boolean.toString(result);
    }

    private boolean getCondition() {
        // This method returns false, making the loop condition always false
        return false;
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}