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
    }

    // Mutated code starts here
    private int z;

    public UninitializedReadBug(int x) {
        // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ) 
        System.out.println("Uninitialized value: " + value); // value is used before being initialized
        this.value = x;
    }

    public int a() {
        return z;
    }

    public static void b(String[] c) {
        UninitializedReadBug d = new UninitializedReadBug(20);
        System.out.println("Mutated initialized value: " + d.a());
    }
}