class BuggyClass {
    private String name;
    private String a; // Mutant: Renamed variable 'name' to 'a'

    public BuggyClass(String name) {
        this.name = name;
        this.a = name; // Mutant: Updated the initial assignment of the renamed variable
    }

    // BUG: OverrideBothEqualsAndHashcode
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        BuggyClass buggyClass = (BuggyClass) obj;
        return a.equals(buggyClass.a); // Mutant: Updated the comparison to use the renamed variable
    }

    public void showBug(BuggyClass other) {
        System.out.println("Equals method result: " + this.equals(other));
        System.out.println("Hashcode of this object: " + this.hashCode());
        System.out.println("Hashcode of other object: " + other.hashCode());
    }
}