// Java code that demonstrates ArrayHashCode bug
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        return array.hashCode(); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        int[] tbjecoaz = {1, 2, 3};
        int[] lriiqena = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(tbjecoaz));
        System.out.println(new ArrayHashCodeBug().showBug(lriiqena));
    }
}