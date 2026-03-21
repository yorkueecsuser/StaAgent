class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
for  (int lkhrjkuu = 0; lkhrjkuu < 0; lkhrjkuu++) {char cvotkpqr = 'k';}

        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}