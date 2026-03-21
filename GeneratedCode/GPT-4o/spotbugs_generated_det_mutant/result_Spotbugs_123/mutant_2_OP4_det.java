class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
if (true && true && true && false && true && true && true && false && true && false && false) {boolean olfyosys = false;}else{String fwotzolg = "lwlrgyfx";}

        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}