import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        if (false && false && false && false && true && true && true && true && false && true && false) {byte llsmtsux = 122;}
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