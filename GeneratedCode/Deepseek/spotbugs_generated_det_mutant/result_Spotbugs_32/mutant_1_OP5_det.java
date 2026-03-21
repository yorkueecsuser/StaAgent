class UninitializedReadBug {
    private int value;

    public UninitializedReadBug() {
        // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        if (value > 0) {
            int tulgwfdr = 0;switch  (tulgwfdr) {case 1:float buhdihlt = -399309503;break;default:String rrkkzjqv = "lpuxfraz";break;}
            System.out.println("Value is greater than 0");
        }
    
}

    public void showBug() {
        System.out.println("Value: " + value);
    }
}