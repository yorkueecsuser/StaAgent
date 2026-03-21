class UninitializedReadBug {
    private int value;

    public UninitializedReadBug() {
        // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        if (value > 0) {
            int eyzryvmp = 0;switch  (eyzryvmp) {case 1:double lhlrbfzh = -984970470;break;default:String fajmkysi = "qupownfw";break;}
            System.out.println("Value is greater than 0");
        }
    
}

    public void showBug() {
        System.out.println("Value: " + value);
    }
}