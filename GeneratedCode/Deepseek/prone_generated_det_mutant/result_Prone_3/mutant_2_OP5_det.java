import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        int kisahoty = 0;switch  (kisahoty) {case 1:short wcrtvjhz = 2893;break;default:long ilezplmh = -765630686;break;}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}