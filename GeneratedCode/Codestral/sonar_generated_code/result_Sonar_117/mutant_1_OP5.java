class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    // Unreachable switch statement mutant
    private void unreachableSwitchMutant(String input) {
        switch (false) {
            case true:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        if (data == null) {
            return "Data: null"; // Fixed the bug
        } else {
            return "Data: " + data;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (data == null) {
            return new BuggyClass(null); // Fixed the bug
        } else {
            return super.clone();
        }
    }

    public void showBug(String input) {
        this.data = input;
        System.out.println(toString());
        try {
            System.out.println(clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        unreachableSwitchMutant(input); // Added the call to the mutant method
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass(null);
        buggyClass.showBug(null);
    }
}