import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        if (false && false && false && false && false && false && true && false && true && true && false) {byte mbevhpnt = -105;}else{short kjvpenot = 3321;}
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