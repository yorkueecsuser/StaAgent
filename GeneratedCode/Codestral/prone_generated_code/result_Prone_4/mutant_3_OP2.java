// Java code that demonstrates ArrayHashCode bug with Duplication Mutation Operator
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        int hashCodeDuplicate = array.hashCode(); // Mutant: Duplication
        return hashCode;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}