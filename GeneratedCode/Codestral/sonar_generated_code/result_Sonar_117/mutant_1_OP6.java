class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        for (int i = 0; getCondition(); i++) { // Unreachable for loop added here
            System.out.println("Unreachable for loop");
        }

        if (data == null) {
            return "";
        } else {
            return "Data: " + data;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        for (int i = 0; getCondition(); i++) { // Unreachable for loop added here
            System.out.println("Unreachable for loop");
        }

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
            System.out.println(clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass(null);
        buggyClass.showBug(null);
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}