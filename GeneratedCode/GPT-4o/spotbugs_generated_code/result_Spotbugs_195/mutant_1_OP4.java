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
        
        // Begin unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            cloned.setData("This will never be set");
        } else {
            // This block is also unreachable
            cloned.setData("Neither will this");
        }
        // End unreachable if-else branch
        
        return cloned;
    }

    // A method that always returns false to ensure the branch is unreachable
    private boolean getUnreachableCondition() {
        return false;
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
}