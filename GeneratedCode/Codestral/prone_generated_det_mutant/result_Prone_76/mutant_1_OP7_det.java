class InfiniteRecursionBug {

    public int showBug() {
boolean fxuunbzt = false;while (fxuunbzt && true && false && true && false && false && true && true && true && false && true && false) {long eplftasl = -492368940;}

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