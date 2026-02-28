class MutableObjectExposer {

    private int[] internalArray;

    public MutableObjectExposer(int[] array) {
        // Make a copy of the array to avoid exposing the original reference
        this.internalArray = array.clone();
        
        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable code inside the constructor.");
        }
    }

    public int[] getInternalArray() {
        return internalArray; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    }

    public static void main(String[] args) {
        MutableObjectExposer exposer = new MutableObjectExposer(new int[]{1, 2, 3});
        int[] arrayFromExposer = exposer.getInternalArray();
        System.out.println("Original value at index 0: " + arrayFromExposer[0]);
        
        // Modify the array
        arrayFromExposer[0] = 99;

        // Show the bug: the original internal array is altered
        System.out.println("Modified value at index 0: " + exposer.getInternalArray()[0]);
    }

    public int[] showBug() {
        return getInternalArray();
    }
    
    private boolean getCondition() {
        return false; // This makes the for loop condition always false
    }
}