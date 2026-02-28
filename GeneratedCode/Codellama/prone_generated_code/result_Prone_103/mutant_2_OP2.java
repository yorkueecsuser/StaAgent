class LossyPrimitiveCompare {
    
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        System.out.println("Result: " + result);
    }
    
    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
    
    // Mutant code:
    public static int duplicatedAssignment() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        return result;
    }
}