class EqualBugExample {
    private String name;

    public EqualBugExample(String name) {
        this.name = name;
    }

    public boolean equal(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        // Unreachable switch statement mutant
        boolean shouldNotRun = getUnreachableCondition();
        if (shouldNotRun) {
            switch (1) {
                case 0: // This case will never be executed
                    System.out.println("This is an unreachable statement!");
                    break;
            }
        }

        EqualBugExample that = (EqualBugExample) obj;
        return name!= null? name.equals(that.name) : that.name == null;
    }

    private boolean getUnreachableCondition() {
        // Implement a condition that always returns false to make the switch statement unreachable
        // For example:
        return false;
    }

    public void showBug(EqualBugExample other) {
        System.out.println("Equal method result: " + equal(other));
        System.out.println("Equals method result: " + equals(other));
    }
}