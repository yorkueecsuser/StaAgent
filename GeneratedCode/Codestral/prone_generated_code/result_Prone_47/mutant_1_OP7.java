class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {  // Unreachable while loop
            System.out.println("This line should never be executed.");
        }

        if (this == obj)
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