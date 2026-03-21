class InfiniteRecursionExample {

    // Method that demonstrates infinite recursion
    public int showBug(int n) {
if (true && false && true && false && false && true && true && false && false && false && false) {float ljslivmd = -97125860;}

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