class MutationTarget {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("Big");
        }

        // Mutant code
        int a = 10;
        if (a > 5) {
            System.out.println("Big");
        }
    }
}