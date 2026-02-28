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
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This statement should never be printed.");
        } else {
            this.data = input;
            System.out.println(toString());
            try {
                System.out.println(clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass(null);
        buggyClass.showBug(null);
    }
}