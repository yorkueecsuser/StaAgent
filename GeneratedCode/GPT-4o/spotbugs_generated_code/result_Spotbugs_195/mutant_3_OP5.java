class CloneBugExample implements Cloneable {
    private String data;

    public CloneBugExample(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    // Overridable method
    public void setData(String data) {
        this.data = data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneBugExample cloned = (CloneBugExample) super.clone();
        cloned.setData("Cloned: " + getData()); // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)

        // Unreachable switch statement mutation
        int unreachableCondition = getUnreachableCondition(); // Dynamic method call
        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // Do nothing
                break;
        }

        return cloned;
    }

    public String showBug() throws CloneNotSupportedException {
        CloneBugExample original = new CloneBugExample("Original Data");
        CloneBugExample cloned = (CloneBugExample) original.clone();
        return cloned.getData();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneBugExample example = new CloneBugExample("Test Data");
        System.out.println(example.showBug());
    }

    // Method to dynamically determine condition for the unreachable switch statement
    private int getUnreachableCondition() {
        return 0; // Ensures the switch statement is never executed
    }
}