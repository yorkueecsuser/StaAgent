class UninitializedReadBug {
    private int value;

    public UninitializedReadBug(int initialValue) {
        // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ) 
        System.out.println("Uninitialized value: " + value); // value is used before being initialized
        this.value = initialValue;
    }

    public int showBug() {
        return value;
    }

    public static void main(String[] args) {
        UninitializedReadBug bugDemo = new UninitializedReadBug(10);
        System.out.println("Initialized value: " + bugDemo.showBug());

        // Introduced loop for mutation
        int i = 0;
        // Original while loop
        while (i < 1) {
            System.out.println("Loop iteration: " + i);
            i++;
        }

        // Mutated do-while loop (Equivalent Loop Replacement)
        int j = 0;
        do {
            System.out.println("Mutated loop iteration: " + j);
            j++;
        } while (j < 1);
    }
}