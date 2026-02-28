class InfiniteRecursionExample {

    private int number = 0; // Example of an assignment statement to be duplicated

    // Example of a method that causes infinite recursion
    public int oops() {
        number = 1; // Duplicated assignment statement
        number = 1; // Duplicated assignment statement
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