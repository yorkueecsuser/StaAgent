import java.util.Arrays;

class ArrayToStringBug {

    public String showBug(int[] array) {
        boolean condition = getCondition(); // Ensure the condition is dynamically determined
        if (condition) { // This branch is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable branch.");
        }
        return array.toString(); // BUG: ArrayToString
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct Output: " + Arrays.toString(sampleArray));
    }
}