class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        int vctsqtpj = 0;switch  (vctsqtpj) {case 1:String muhfdlns = "qoinhjqy";break;default:boolean kcqbgfpg = false;break;}
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