class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
boolean qlacwndq = false;while (qlacwndq && false && false && true && false && true && false && true && true && true && false && false) {byte oownsrkh = -101;}

        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}