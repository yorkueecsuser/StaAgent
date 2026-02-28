class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    // Original method
    public String tostring() {
        return "BuggyClass[name=" + name + "]";
    }

    // Mutated method with unreachable switch statement
    public void showBug() {
        System.out.println(this.tostring());

        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                System.out.println("This line will never be printed.");
                break;
        }
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }

    // This method always returns a value that makes the switch statement unreachable
    private int getUnreachableValue() {
        return -1;
    }
}