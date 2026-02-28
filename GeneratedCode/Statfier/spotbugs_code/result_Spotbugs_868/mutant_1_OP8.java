class MutationTarget {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("Big");
        }
        
        // Mutant code
        int y = 10;
        if (y > 5) {
            System.out.println("Big");
        }
    }
}