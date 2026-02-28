class LossyPrimitiveCompare {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        System.out.println("Result: " + result);

        // Mutation: Unreachable if-else statement
        if (false) {
            // Code that is always unreachable
            System.out.println("This code is never executed.");
        } else {
            // Code that is always executed
            System.out.println("This code is always executed.");
        }
    }

    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
}