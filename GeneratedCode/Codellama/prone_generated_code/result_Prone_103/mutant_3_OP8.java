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

/* Mutation: Renaming */
class LossyPrimitiveCompare {
    
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE - 1;
        int result = Float.compare(x, y);
        System.out.println("Result: " + result);
    }
    
    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
}