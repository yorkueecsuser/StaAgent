class MutableObjectExposer {

    private int[] a; // Renamed variable internalArray to a

    public MutableObjectExposer(int[] b) { // Renamed variable array to b
        // Make a copy of the array to avoid exposing the original reference
        this.a = b.clone();
    }

    public int[] getInternalArray() {
        return a; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    }

    public static void main(String[] args) {
        MutableObjectExposer c = new MutableObjectExposer(new int[]{1, 2, 3}); // Renamed exposer to c
        int[] d = c.getInternalArray(); // Renamed arrayFromExposer to d
        System.out.println("Original value at index 0: " + d[0]);
        
        // Modify the array
        d[0] = 99;

        // Show the bug: the original internal array is altered
        System.out.println("Modified value at index 0: " + c.getInternalArray()[0]);
    }

    public int[] showBug() {
        return getInternalArray();
    }
}