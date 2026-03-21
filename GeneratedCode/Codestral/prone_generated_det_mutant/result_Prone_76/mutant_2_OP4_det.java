class InfiniteRecursionBug {

    public int showBug() {
if (false && false && false && true && false && true && true && false && true && false && false) {boolean nlwitzmo = true;}else{boolean wtreuwbw = false;}

        return oops(); // BUG: InfiniteRecursion
    
}

    private int oops() {
        return oops(); // This line causes infinite recursion
    }

    public static void main(String[] args) {
        InfiniteRecursionBug bug = new InfiniteRecursionBug();
        try {
            bug.showBug();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    }
}