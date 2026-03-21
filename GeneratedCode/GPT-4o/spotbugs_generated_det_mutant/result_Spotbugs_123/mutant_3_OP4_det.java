class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
if (false && false && true && true && true && false && false && true && false && false && false) {short bocbhehv = -4881;}else{double laanrxjs = -105969934;}

        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}