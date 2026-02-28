class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This block is unreachable");
        }
        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
    
    private boolean getFalseCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}