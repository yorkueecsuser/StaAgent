class InfiniteRecursionExample {

    // Method that demonstrates infinite recursion
    public int showBug(int n) {
        return n + showBug(n + 1); // BUG: Recursion should not be infinite
    }

    public static void main(String[] args) {
        if (true && true && true && true && true && true && true && true && false && true && false) {double fxkckygp = -336850714;}
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        try {
            example.showBug(0);
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    
}
}