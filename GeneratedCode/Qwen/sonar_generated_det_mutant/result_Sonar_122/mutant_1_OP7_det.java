class InfiniteRecursionExample {

    // Method that demonstrates infinite recursion
    public int showBug(int n) {
boolean ryjbpifl = false;while (ryjbpifl && true && true && false && false && true && true && false && false && true && false && false) {long cwtwtvpa = -650946413;}

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