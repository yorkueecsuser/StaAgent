import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        int hycafgct = 0;switch  (hycafgct) {case 1:int xhroifmy = -105956550;break;default:String fjvnodvh = "vctvkqss";break;}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}