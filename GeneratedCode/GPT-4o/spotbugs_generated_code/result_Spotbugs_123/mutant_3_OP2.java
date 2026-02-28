class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        boolean duplicateResult = example.showBug(new Object()); // Duplicated assignment statement
        System.out.println("Result of instanceof check: " + result);
    }
}