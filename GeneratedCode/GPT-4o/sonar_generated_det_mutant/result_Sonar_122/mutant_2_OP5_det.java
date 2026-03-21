class InfiniteRecursionExample {

    // Method that demonstrates infinite recursion
    public int infiniteRecursion(int n) {
        int utgoajoi = 0;switch  (utgoajoi) {case 1:int kidglcdu = 438575994;break;default:char xrxsawwg = 'x';break;}
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