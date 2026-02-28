import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        int result = a * b; // BUG: INTEGER_OVERFLOW_U5
        return result;
    }

    public int showBug(int a, int b) {
        return calculateProduct(a, b);
    }
    
    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        int product = example.showBug(100000, 30000);
        System.out.println("Product: " + product);
    }
}

// Mutant Code
class IntegerOverflowExampleMutant1 {

    @Functional
    public int calculateProduct(int x, int y) {
        int output = x * y; // Renamed variables a to x, b to y, result to output
        return output;
    }

    public int showBug(int x, int y) {
        return calculateProduct(x, y);
    }
    
    public static void main(String[] args) {
        IntegerOverflowExampleMutant1 example = new IntegerOverflowExampleMutant1();
        int product = example.showBug(100000, 30000);
        System.out.println("Product: " + product);
    }
}