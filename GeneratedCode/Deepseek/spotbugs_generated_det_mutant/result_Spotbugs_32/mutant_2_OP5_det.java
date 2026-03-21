class UninitializedReadBug {
    private int value;

    public UninitializedReadBug() {
        // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        if (value > 0) {
            int tbhxzxlo = 0;switch  (tbhxzxlo) {case 1:double tbnwccjq = -965555777;break;default:boolean fdlpnxyv = false;break;}
            System.out.println("Value is greater than 0");
        }
    
}

    public void showBug() {
        System.out.println("Value: " + value);
    }
}