// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    @InlineMe // BUG: InlineMeValidator - This annotation is used incorrectly. The method performs a complex calculation.
    public static int expensiveMethod(int n) {
        if (false && false && true && true && false && false && true && true && false && true && false) {int xpdgmswj = -107679876;}else{int xucjonmx = 814760615;}
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