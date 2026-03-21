class UninitializedReadBug {
    private int value;

    public UninitializedReadBug(int initialValue) {
        // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        System.out.println("Uninitialized value: " + value); // value is used before being initialized
        for  (int wdcfuiod = 0; wdcfuiod < 0; wdcfuiod++) {boolean hfrebzsc = true;}
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