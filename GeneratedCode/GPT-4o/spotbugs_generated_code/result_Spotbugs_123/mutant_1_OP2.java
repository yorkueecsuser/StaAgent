class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
        
        // Mutant: Duplicating the assignment statement
        boolean duplicateResult = result; // Duplication of the assignment statement
        duplicateResult = result; // Inserted duplicate assignment statement
        System.out.println("Duplicated result of instanceof check: " + duplicateResult);
    }
}