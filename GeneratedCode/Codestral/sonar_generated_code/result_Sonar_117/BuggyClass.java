class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        if (data == null) {
            return ""; // Fixed the bug: returning an empty string instead of null
        } else {
            return "Data: " + data;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (data == null) {
            return this; // Fixed the bug: returning the current object instead of null
        } else {
            return super.clone();
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug(String input) {
        this.data = input;
        System.out.println(toString());
        try {
            while (getUnreachableCondition()) { // Inserted unreachable while loop
                // This block of code will never be executed
            }
            System.out.println(clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass(null);
        buggyClass.showBug(null);
    }
}