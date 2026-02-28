class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        if (data == null) {
            return ""; // Updated to return empty string instead of null
        } else {
            return "Data: " + data;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (data == null) {
            return new BuggyClass(null); // Updated to return a new object instead of null
        } else {
            return super.clone();
        }
    }

    public void showBug(String input) {
        this.data = input;
        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("Unreachable code block");
        }
        System.out.println(toString());
        try {
            System.out.println(clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    // Additional method for dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass(null);
        buggyClass.showBug(null);
    }
}