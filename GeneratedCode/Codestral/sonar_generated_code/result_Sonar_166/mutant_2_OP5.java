class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    public String tostring() {
        return "BuggyClass[name=" + name + "]";
    }

    public void showBug() {
        System.out.println(this.tostring()); // This will not be printed as expected.

        // Mutant: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This line will never be executed.");
                break;
            default:
                // Default case to avoid compiler warnings
                break;
        }
    }

    public static int getValue() {
        return 2; // Always different from the case value
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}