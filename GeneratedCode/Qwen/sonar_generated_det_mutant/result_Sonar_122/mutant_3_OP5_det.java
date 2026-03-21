class InfiniteRecursionExample {

    // Method that demonstrates infinite recursion
    public int showBug(int n) {
        return n + showBug(n + 1); // BUG: Recursion should not be infinite
    }

    public static void main(String[] args) {
        int zlpquqsr = 0;switch  (zlpquqsr) {case 1:char vszkkary = 'h';break;default:float cqopgzvn = 759697429;break;}
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        try {
            example.showBug(0);
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    
}
}