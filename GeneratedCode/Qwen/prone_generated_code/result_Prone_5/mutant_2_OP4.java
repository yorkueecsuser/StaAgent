import java.util.Arrays;

class ArrayToStringBug {

    public String showBug(int[] array) {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Some unreachable code
            System.out.println("This is unreachable code.");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code.");
        }
        return array.toString(); // BUG: ArrayToString
    }

    private boolean getCondition() {
        // This method returns false, making the if-else block effectively unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct Output: " + Arrays.toString(sampleArray));
    }
}