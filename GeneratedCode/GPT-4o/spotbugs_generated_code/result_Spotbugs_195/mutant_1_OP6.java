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

        // Introducing an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }

        return cloned;
    }

    private boolean getCondition() {
        return false; // This makes the for loop unreachable
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