class InfiniteRecursionExample {

    // Method that demonstrates infinite recursion
    public int showBug(int n) {
int mcvldena = 0;switch  (mcvldena) {case 1:byte cbcnvfdi = -94;break;default:boolean glpfqbzq = true;break;}

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