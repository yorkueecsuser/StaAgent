class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        // Unreachable for loop added as per mutation operator
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop.");
        }
        
        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }

    private boolean getCondition() {
        return false; // Ensures the for loop is unreachable
    }
}