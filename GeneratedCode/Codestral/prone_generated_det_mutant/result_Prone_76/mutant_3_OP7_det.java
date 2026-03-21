class InfiniteRecursionBug {

    public int showBug() {
boolean mckelnyk = false;while (mckelnyk && false && true && false && false && false && true && false && true && false && true && false) {double veonxzku = -849795837;}

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