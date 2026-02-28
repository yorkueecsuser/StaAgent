class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        if (data == null) {
            return null;
        } else {
            return "Data: " + data;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (data == null) {
            return null;
        } else {
            return super.clone();
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the condition unreachable
    }

    public void showBug(String input) {
        this.data = input;
        System.out.println(toString());
        try {
            System.out.println(clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Mutant code: Unreachable if-else statement
        if (getUnreachableCondition()) {
            // This block will never be executed
            System.out.println("This is an unreachable block.");
        } else {
            // This block will always be executed
            System.out.println("This block is always executed.");
        }
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass(null);
        buggyClass.showBug(null);
    }
}