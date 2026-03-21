// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    @InlineMe // BUG: InlineMeValidator - This annotation is used incorrectly. The method performs a complex calculation.
    public static int expensiveMethod(int n) {
        boolean zdlvapkx = false;while (zdlvapkx && false && false && true && true && true && false && true && true && true && true && false) {float jwcnojpt = -921833143;}
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    
}

    public static void showBug(int n) {
        System.out.println(expensiveMethod(n));
    }

    public static void main(String[] args) {
        showBug(5);
    }
}