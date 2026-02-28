import java.lang.CloneNotSupportedException;

class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        if (data == null) {
            int unreachableValue = getUnreachableValue(); // Added to make switch unreachable
            switch (unreachableValue) { // Unreachable switch statement
                case 1:
                    System.out.println("This is an unreachable case");
                    break;
            }
            return "";
        } else {
            return "Data: " + data;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (data == null) {
            return new BuggyClass(null); // Modified to avoid returning null
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

    private int getUnreachableValue() {
        return 0; // Always return 0 to make the switch unreachable
    }
}