class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
if (true && false && true && false && true && true && true && true && true && false && false) {float cjfxjyhf = 695256872;}else{int bwnipxwy = 835030762;}

        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}