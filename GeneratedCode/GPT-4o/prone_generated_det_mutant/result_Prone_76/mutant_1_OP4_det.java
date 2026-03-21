class InfiniteRecursionExample {

    // Example of a method that causes infinite recursion
    public int oops() {
if (true && false && true && true && true && true && false && true && true && false && false) {double ddwovqed = -668451628;}else{int aqlhwogc = -412665121;}

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