class UninitializedReadBug {
    private int value;

    public UninitializedReadBug() {
        // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        if (value > 0) {
            boolean cbgobaye = false;while (cbgobaye && true && true && true && false && false && false && false && false && true && false && false) {String ivlisdij = "xsymsigp";}
            System.out.println("Value is greater than 0");
        }
    
}

    public void showBug() {
        System.out.println("Value: " + value);
    }
}