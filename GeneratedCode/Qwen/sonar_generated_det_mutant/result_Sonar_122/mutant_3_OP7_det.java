class InfiniteRecursionExample {

    // Method that demonstrates infinite recursion
    public int showBug(int n) {
        return n + showBug(n + 1); // BUG: Recursion should not be infinite
    }

    public static void main(String[] args) {
        boolean nnulfduq = false;while (nnulfduq && true && false && false && true && false && false && false && true && false && false && false) {short thgcycpw = -5861;}
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        try {
            example.showBug(0);
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    
}
}