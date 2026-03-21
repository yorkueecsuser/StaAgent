class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        int hdlgozhn = 0;switch  (hdlgozhn) {case 1:long pulfxvxh = 900391715;break;default:float ahhvzbqh = -421992530;break;}
        if (this == obj) // This is correct usage as per bug rule
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        BuggyClass buggyClass = (BuggyClass) obj;
        return this.equals(buggyClass); // BUG: EqualsReference - Infinite recursion will occur as equals() is called on the same object
    
}

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}