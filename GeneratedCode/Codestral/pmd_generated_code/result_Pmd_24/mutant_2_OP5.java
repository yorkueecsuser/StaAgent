class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Added unreachable switch statement
        boolean condition = false;
        if (condition) {
            int value = getValue();
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("Unreachable code executed!");
                    break;
                default:
                    // Default case
                    break;
            }
        }
        return super.clone();
    }

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }

    // Method to return a value for the switch statement
    private int getValue() {
        return 0;
    }
}