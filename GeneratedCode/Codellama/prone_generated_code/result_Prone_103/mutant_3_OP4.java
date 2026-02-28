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
}

// Unreachable if-else statement mutant
class LossyPrimitiveCompare {
    
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        System.out.println("Result: " + result);
        if (false) {
            // Unreachable code
            System.out.println("Hello, World!");
        } else {
            System.out.println("Goodbye, World!");
        }
    }
    
    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
}