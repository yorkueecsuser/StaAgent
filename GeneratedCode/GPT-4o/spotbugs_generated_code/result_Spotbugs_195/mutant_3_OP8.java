class CloneBugExample implements Cloneable {
    private String a; // Renamed 'data' to 'a'

    public CloneBugExample(String a) { // Renamed 'data' to 'a'
        this.a = a; // Renamed 'data' to 'a'
    }

    public String getData() {
        return a; // Renamed 'data' to 'a'
    }

    // Overridable method
    public void setData(String a) { // Renamed 'data' to 'a'
        this.a = a; // Renamed 'data' to 'a'
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneBugExample cloned = (CloneBugExample) super.clone();
        cloned.setData("Cloned: " + getData()); // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        return cloned;
    }

    public String showBug() throws CloneNotSupportedException {
        CloneBugExample b = new CloneBugExample("Original Data"); // Renamed 'original' to 'b'
        CloneBugExample c = (CloneBugExample) b.clone(); // Renamed 'cloned' to 'c'
        return c.getData(); // Renamed 'cloned' to 'c'
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneBugExample d = new CloneBugExample("Test Data"); // Renamed 'example' to 'd'
        System.out.println(d.showBug()); // Renamed 'example' to 'd'
    }
}