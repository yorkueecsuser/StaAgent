// Java code that demonstrates ArrayHashCode bug
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        return array.hashCode(); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        int[] rurnrlyf = {1, 2, 3};
        int[] utpwnxby = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(rurnrlyf));
        System.out.println(new ArrayHashCodeBug().showBug(utpwnxby));
    }
}