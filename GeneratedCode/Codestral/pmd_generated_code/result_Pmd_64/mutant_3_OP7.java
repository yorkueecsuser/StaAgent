class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    // Mutant: Unreachable while loop
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        BuggyClass buggyClass = (BuggyClass) obj;

        // Mutation: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop.");
        }

        return name.equals(buggyClass.name);
    }

    public void showBug(BuggyClass other) {
        System.out.println("Equals method result: " + this.equals(other));
        System.out.println("Hashcode of this object: " + this.hashCode());
        System.out.println("Hashcode of other object: " + other.hashCode());
    }
}