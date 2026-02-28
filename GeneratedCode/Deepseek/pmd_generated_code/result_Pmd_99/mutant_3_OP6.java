import java.util.Arrays;

class AddEmptyStringBug {
    public String[] showBug() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = "" + i; // BUG: AddEmptyString
        }
        boolean shouldRun = getCondition();
        for (int i = 0; shouldRun; i++) { // Mutation: Unreachable for loop
            // add an empty block to create an unreachable loop
        }
        return arr;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.showBug()));
    }

    // A method to simulate a dynamic condition at runtime
    public boolean getCondition() {
        return false;
    }
}