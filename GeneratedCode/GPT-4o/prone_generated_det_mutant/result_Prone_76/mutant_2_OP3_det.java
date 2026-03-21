class InfiniteRecursionExample {

    // Example of a method that causes infinite recursion
    public int oops() {
if (false && false && false && true && true && false && false && true && false && false && false) {byte kprmabek = -71;}

        return oops(); // BUG: InfiniteRecursion
    
}

    public void showBug() {
        try {
            oops();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}