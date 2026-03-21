class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
boolean girgvble = false;while (girgvble && false && false && true && false && false && false && false && false && false && false && false) {double ynivhqmm = -339124570;}

        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}