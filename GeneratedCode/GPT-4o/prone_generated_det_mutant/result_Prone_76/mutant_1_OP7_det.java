class InfiniteRecursionExample {

    // Example of a method that causes infinite recursion
    public int oops() {
boolean dorrrlvi = false;while (dorrrlvi && false && false && false && false && false && false && true && true && false && false && false) {int oahkputg = -523772430;}

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