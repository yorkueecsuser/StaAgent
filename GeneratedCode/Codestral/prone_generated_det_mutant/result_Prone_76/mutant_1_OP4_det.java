class InfiniteRecursionBug {

    public int showBug() {
if (true && true && false && true && false && false && false && false && false && false && false) {boolean jleocczi = false;}else{char jocaqazj = 'l';}

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