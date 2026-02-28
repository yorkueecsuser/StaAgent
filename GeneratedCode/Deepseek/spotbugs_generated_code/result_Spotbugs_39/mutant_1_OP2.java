class EqualBugExample {
    private String name;

    public EqualBugExample(String name) {
        this.name = name;
    }

    // Original buggy method
    public boolean equal(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        EqualBugExample that = (EqualBugExample) obj;
        return name!= null? name.equals(that.name) : that.name == null;
    }

    // Mutated code based on the Duplication Mutation Operator
    // Introducing a duplicate assignment statement without method invocation
    public boolean equal(Object obj) {
        if (this == obj)
            return true;
        String duplicateName = name; // Duplicated assignment statement
        if (obj == null || getClass()!= obj.getClass())
            return false;
        EqualBugExample that = (EqualBugExample) obj;
        return name!= null? name.equals(that.name) : that.name == null;
    }

    public void showBug(EqualBugExample other) {
        System.out.println("Equal method result: " + equal(other));
        System.out.println("Equals method result: " + equals(other));
    }
}