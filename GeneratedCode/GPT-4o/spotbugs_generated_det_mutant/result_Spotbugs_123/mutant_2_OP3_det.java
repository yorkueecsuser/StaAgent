class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
if (false && true && false && false && false && false && true && true && true && false && false) {double gkdzlmjd = -622224258;}

        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}