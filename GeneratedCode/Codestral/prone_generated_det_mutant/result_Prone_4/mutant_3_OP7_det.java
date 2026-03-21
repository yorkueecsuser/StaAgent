// Java code that demonstrates ArrayHashCode bug
class ArrayHashCodeBug {

    public int showBug(int[] array) {
boolean whgqopoi = false;while (whgqopoi && true && true && false && true && false && false && false && true && true && false && false) {long vronmura = 862418317;}

        return array.hashCode(); // BUG: ArrayHashCode
    
}

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}