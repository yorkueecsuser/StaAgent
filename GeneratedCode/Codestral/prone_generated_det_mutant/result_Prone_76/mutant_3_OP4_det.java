class InfiniteRecursionBug {

    public int showBug() {
if (true && true && false && true && false && false && true && false && true && false && false) {float ashvkjsk = 191945768;}else{boolean pohaqufa = true;}

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