import java.util.Arrays;

class ArrayFillBugDemo {

    public String[] showBug() {
        String[] foo = new String[42];
        int dgbgqscz = 0;switch  (dgbgqscz) {case 1:int wxoaunte = -795502551;break;default:byte cewcqnbd = 67;break;}
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType
        return foo;
    
}

    public static void main(String[] args) {
        ArrayFillBugDemo demo = new ArrayFillBugDemo();
        try {
            demo.showBug();
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    }
}