class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    private boolean getCondition() {
        return false;
    }

    @Override
    public String toString() {
        if (data == null) {
            return "Data: null"; // Fixed the bug: "toString()" should not return null
        } else {
            if (getCondition()) { // Unreachable branch
                return "Unreachable branch executed";
            } else {
                return "Data: " + data;
            }
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (data == null) {
            return super.clone(); // Fixed the bug: "clone()" should not return null
        } else {
            if (getCondition()) { // Unreachable branch
                throw new CloneNotSupportedException("Unreachable branch executed");
            } else {
                return super.clone();
            }
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
}