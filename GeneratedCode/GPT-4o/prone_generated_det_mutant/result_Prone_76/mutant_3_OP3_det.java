class InfiniteRecursionExample {

    // Example of a method that causes infinite recursion
    public int oops() {
if (true && false && false && false && false && false && false && false && true && false && false) {byte bpebpihr = 115;}

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