class EqualBugExample {
    private String name;

    public EqualBugExample(String name) {
        this.name = name;
    }

    public boolean equal(Object obj) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }

        if (this == obj)
            return true;
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