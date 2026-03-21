class InfiniteRecursionBug {

    public int showBug() {
for  (int ecqwkkqx = 0; ecqwkkqx < 0; ecqwkkqx++) {long yxfhaorp = -304664659;}

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