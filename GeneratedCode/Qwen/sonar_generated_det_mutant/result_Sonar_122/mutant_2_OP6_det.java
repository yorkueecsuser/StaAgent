class InfiniteRecursionExample {

    // Method that demonstrates infinite recursion
    public int showBug(int n) {
for  (int tmiwabst = 0; tmiwabst < 0; tmiwabst++) {int uocuuftk = -714207118;}

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