class MutationTarget {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("Big");
        }
        // Dead store mutation
        int qzjfnrvt = 42; // Unused variable declaration
    }
}