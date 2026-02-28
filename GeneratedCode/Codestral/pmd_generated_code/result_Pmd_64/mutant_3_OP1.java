class BuggyClass {
    private String name;
    // Mutant: Dead Store
    private int unusedVariable;

    public BuggyClass(String name) {
        this.name = name;
        // Mutant: Initialization of the dead store variable
        this.unusedVariable = 0;
    }

    // BUG: OverrideBothEqualsAndHashcode
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
        System.out.println("Equals method result: " + this.equals(other));
        System.out.println("Hashcode of this object: " + this.hashCode());
        System.out.println("Hashcode of other object: " + other.hashCode());
        // Mutant: Using the dead store variable in a print statement (this line is not necessary and it serves no purpose, it's just to show the presence of the dead store variable)
        System.out.println("Value of unused variable: " + this.unusedVariable);
    }
}