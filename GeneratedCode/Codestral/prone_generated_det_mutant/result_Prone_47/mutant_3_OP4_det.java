class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (false && true && true && false && false && false && true && false && false && false && false) {long ibzmgzcp = 689000702;}else{byte wshdpobo = 54;}
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