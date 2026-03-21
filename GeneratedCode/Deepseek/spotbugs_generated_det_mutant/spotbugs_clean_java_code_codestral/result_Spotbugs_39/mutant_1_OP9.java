class EqualBugExample {
    private String name;

    public EqualBugExample(String name) {
        this.name = name;
    }

    // Mutant bug: Fixing Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        EqualBugExample that = (EqualBugExample) obj;
        return name!= null? name.equals(that.name) : that.name == null;
    }

    public void showBug(EqualBugExample other) {
        System.out.println("Equal method result: " + equals(other));
        System.out.println("Equals method result: " + equals(other));
    }
}