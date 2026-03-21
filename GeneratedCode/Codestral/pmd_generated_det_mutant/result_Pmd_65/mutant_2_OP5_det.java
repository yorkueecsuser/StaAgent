class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        int htekapzs = 0;switch  (htekapzs) {case 1:long cewtsomd = 316832493;break;default:long ugbquqdm = -195831794;break;}
        // BUG: ProperCloneImplementation
        return new BuggyCloneImplementation(this.value); // This is bad, it should be super.clone()
    
}

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}