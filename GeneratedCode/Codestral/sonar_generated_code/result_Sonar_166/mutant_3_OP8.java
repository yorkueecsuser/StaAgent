class BuggyClass {
    private String name;

    public BuggyClass(String variable) {
        this.name = variable;
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String tostring() {
        return "BuggyClass[name=" + name + "]";
    }

    public void showBug() {
        String renamedMethod = this.tostring(); // Renamed 'tostring()' to'renamedMethod'
        System.out.println(renamedMethod);
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}