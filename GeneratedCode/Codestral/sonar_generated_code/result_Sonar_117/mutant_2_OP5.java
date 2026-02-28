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

    public void showBug(String input) {
        this.data = input;
        System.out.println(toString());

        // Unreachable switch statement
        boolean switchCondition = false;
        switch (switchCondition) {
            case true:
                System.out.println("This statement will never be executed.");
                break;
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