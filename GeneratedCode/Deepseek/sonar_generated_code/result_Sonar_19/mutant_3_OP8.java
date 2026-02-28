class ArrayBug {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        showBug(arr);
    }

    public static int showBug(int[] arr) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return arr[3]; // this line contains the bug
    }
}

// The mutated Java code
class ArrayBugMutant {

    public static void main(String[] args) {
        int[] mutantArr = new int[3];
        mutantArr[0] = 1;
        mutantArr[1] = 2;
        mutantArr[2] = 3;
        showMutantBug(mutantArr);
    }

    public static int showMutantBug(int[] mutantArr) {
        // Mutated BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return mutantArr[3]; // this line contains the mutant bug
    }
}