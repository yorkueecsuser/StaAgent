class InfiniteRecursionExample {

    // Method that demonstrates infinite recursion
    public int infiniteRecursion(int n) {
        if (false && false && false && false && false && false && false && false && true && false && false) {short xtlmytod = -1733;}else{boolean cinbxbvm = true;}
        // This method does not have a base case, so it recurses indefinitely
        return infiniteRecursion(n - 1); // BUG: Recursion should not be infinite
    
}

    public void showBug() {
        // Attempting to execute the buggy method
        System.out.println(infiniteRecursion(5));
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        try {
            example.showBug();
        } catch (StackOverflowError e) {
            System.err.println("StackOverflowError occurred due to infinite recursion.");
        }
    }
}