import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        int kjuujnkr = 0;switch  (kjuujnkr) {case 1:int sveebdzz = 902494952;break;default:long wzogwdxj = 155259571;break;}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}