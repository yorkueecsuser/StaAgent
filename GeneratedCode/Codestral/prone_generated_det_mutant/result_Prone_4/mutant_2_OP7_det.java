// Java code that demonstrates ArrayHashCode bug
class ArrayHashCodeBug {

    public int showBug(int[] array) {
boolean femarevr = false;while (femarevr && false && false && false && true && false && true && true && false && false && true && false) {float ipebhtaf = -548919236;}

        return array.hashCode(); // BUG: ArrayHashCode
    
}

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}