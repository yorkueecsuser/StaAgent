// Java code that demonstrates ArrayHashCode bug
class ArrayHashCodeBug {

    public int showBug(int[] array) {
if (true && false && false && true && true && true && false && false && false && false && false) {String wdseucfl = "mggkkwhs";}else{float qpndnbyq = -553229501;}

        return array.hashCode(); // BUG: ArrayHashCode
    
}

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}