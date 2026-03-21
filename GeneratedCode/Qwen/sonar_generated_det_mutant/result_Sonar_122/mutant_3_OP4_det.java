class InfiniteRecursionExample {

    // Method that demonstrates infinite recursion
    public int showBug(int n) {
if (false && true && false && true && false && false && true && false && true && true && false) {float ltmmtwxg = 740105046;}else{float nnlfoqjs = -122631246;}

        return n + showBug(n + 1); // BUG: Recursion should not be infinite
    
}

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        try {
            example.showBug(0);
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    }
}