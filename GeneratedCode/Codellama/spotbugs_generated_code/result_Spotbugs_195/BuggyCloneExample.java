import java.util.ArrayList;

class BuggyCloneExample {
    private ArrayList<String> data = new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        BuggyCloneExample clone = (BuggyCloneExample) super.clone();
        clone.data = (ArrayList<String>) this.data.clone();
        // Unreachable while loop
        boolean isReachable = true;
        while (isReachable) {
            isReachable = false;
        }
        clone.initializeData();
        return clone;
    }

    // This method is overridable and can be modified in a subclass to affect the behavior of clone().
    // It can also observe or modify the clone object in a partially initialized state.
    public void initializeData() {
        // Initialize the data in the clone object
    }

    public static void main(String[] args) {
        try {
            BuggyCloneExample bce = new BuggyCloneExample();
            bce.data.add("test");
            BuggyCloneExample clone = (BuggyCloneExample) bce.clone();
            System.out.println(clone.data);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}