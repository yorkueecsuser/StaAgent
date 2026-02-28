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

        // Unreachable switch statement
        boolean alwaysFalse = false;
        switch (alwaysFalse) {
            case true:
                System.out.println("This line should never be executed");
                break;
        }

        return name.equals(buggyClass.name);
    }

    public void showBug(BuggyClass other) {
        System.out.println("Equals method result: " + this.equals(other));
        System.out.println("Hashcode of this object: " + this.hashCode());
        System.out.println("Hashcode of other object: " + other.hashCode());
    }
}