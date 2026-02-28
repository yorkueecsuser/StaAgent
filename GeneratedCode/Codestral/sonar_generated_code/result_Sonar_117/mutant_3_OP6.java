class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        if (data == null) {
            return "";
        } else {
            return "Data: " + data;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (data == null) {
            return super.clone();
        } else {
            return super.clone();
        }
    }

    public void showBug(String input) {
        this.data = input;
        System.out.println(toString());
        try {
            // Unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // Code inside the loop will never be executed
            }
            System.out.println(clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private boolean getCondition() {
        return false; // Always return false to make the for loop unreachable
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass(null);
        buggyClass.showBug(null);
    }
}