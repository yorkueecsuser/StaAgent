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
        if (true && true && false && true && false && true && false && false && true && false && false) {boolean udhafyip = false;}else{short ribazlbd = 5078;}
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