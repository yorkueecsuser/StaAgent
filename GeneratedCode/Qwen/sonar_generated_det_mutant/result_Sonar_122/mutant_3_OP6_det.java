class InfiniteRecursionExample {

    // Method that demonstrates infinite recursion
    public int showBug(int n) {
for  (int mxgqwmvs = 0; mxgqwmvs < 0; mxgqwmvs++) {int ymcchdyf = -776441602;}

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