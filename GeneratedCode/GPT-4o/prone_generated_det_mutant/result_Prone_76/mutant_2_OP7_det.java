class InfiniteRecursionExample {

    // Example of a method that causes infinite recursion
    public int oops() {
boolean ulcbygiz = false;while (ulcbygiz && false && false && true && true && false && false && false && false && false && true && false) {float bxeldkay = -646873538;}

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