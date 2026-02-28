class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        if (data == null) {
            return ""; // Fixed the bug here
        } else {
            return "Data: " + data;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (data == null) {
            throw new CloneNotSupportedException("Cannot clone object with null data"); // Fixed the bug here
        } else {
            return super.clone();
        }
    }

    public void showBug(String input) {
        this.data = input;
        System.out.println(toString());

        // Inserted an unreachable for loop here
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable");
        }

        try {
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