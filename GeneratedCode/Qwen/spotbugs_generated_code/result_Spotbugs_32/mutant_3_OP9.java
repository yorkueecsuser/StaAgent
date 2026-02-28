class UninitializedReadBug {
    private int value;

    public UninitializedReadBug(int initialValue) {
        // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ) 
        System.out.println("Uninitialized value: " + value); // value is used before being initialized

        // Added unique loop for mutation operator demonstration
        int i = 0;
        do {
            if (i == 0) {
                System.out.println("Loop iteration: " + i);
            }
            i++;
        } while (i < 1);

        this.value = initialValue;
    }

    public int showBug() {
        return value;
    }

    public static void main(String[] args) {
        UninitializedReadBug bugDemo = new UninitializedReadBug(10);
        System.out.println("Initialized value: " + bugDemo.showBug());
    }
}