// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    @InlineMe // BUG: InlineMeValidator - This annotation is used incorrectly. The method performs a complex calculation.
    public static int expensiveMethod(int n) {
        int rwtepbhp = 0;switch  (rwtepbhp) {case 1:byte yevrodpm = 72;break;default:double anpnrxik = 658862971;break;}
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