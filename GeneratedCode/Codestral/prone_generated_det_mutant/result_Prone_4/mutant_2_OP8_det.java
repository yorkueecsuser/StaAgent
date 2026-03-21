// Java code that demonstrates ArrayHashCode bug
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        return array.hashCode(); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        int[] yehphlrk = {1, 2, 3};
        int[] lfeullav = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(yehphlrk));
        System.out.println(new ArrayHashCodeBug().showBug(lfeullav));
    }
}