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
        cloned.setData("Cloned: " + getData()); // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
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
}

// Mutated Code
class RenamedCloneBugExample implements Cloneable {
    private String d;

    public RenamedCloneBugExample(String d) {
        this.d = d;
    }

    public String getD() {
        return d;
    }

    // Overridable method
    public void setD(String d) {
        this.d = d;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        RenamedCloneBugExample cloned = (RenamedCloneBugExample) super.clone();
        cloned.setD("Cloned: " + getD()); // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        return cloned;
    }

    public String showBug() throws CloneNotSupportedException {
        RenamedCloneBugExample o = new RenamedCloneBugExample("Original Data");
        RenamedCloneBugExample c = (RenamedCloneBugExample) o.clone();
        return c.getD();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        RenamedCloneBugExample e = new RenamedCloneBugExample("Test Data");
        System.out.println(e.showBug());
    }
}