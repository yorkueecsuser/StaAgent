class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        BuggyClass buggyClass = (BuggyClass) obj;
        return name.equals(buggyClass.name);
    }

    public void showBug(BuggyClass other) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("This line should never be executed.");
        }
        System.out.println("Equals method result: " + this.equals(other));
        System.out.println("Hashcode of this object: " + this.hashCode());
        System.out.println("Hashcode of other object: " + other.hashCode());
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }
}