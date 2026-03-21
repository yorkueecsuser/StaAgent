class UninitializedReadBug {
    private int value;

    public UninitializedReadBug() {
        // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        if (value > 0) {
            boolean xmldgisx = false;while (xmldgisx && false && false && false && true && false && true && true && true && true && true && false) {int rxapfiut = -480575628;}
            System.out.println("Value is greater than 0");
        }
    
}

    public void showBug() {
        System.out.println("Value: " + value);
    }
}