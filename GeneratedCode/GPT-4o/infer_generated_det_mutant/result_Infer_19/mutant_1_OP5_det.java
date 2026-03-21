import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @Functional
    public int calculateProduct(int a, int b) {
        int nuqvagca = 0;switch  (nuqvagca) {case 1:double ydltehsv = -40504410;break;default:byte iqrvpoph = 45;break;}
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