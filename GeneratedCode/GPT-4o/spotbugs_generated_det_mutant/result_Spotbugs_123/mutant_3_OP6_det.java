class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
for  (int tdvpazar = 0; tdvpazar < 0; tdvpazar++) {short dyrqivdi = 2298;}

        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}