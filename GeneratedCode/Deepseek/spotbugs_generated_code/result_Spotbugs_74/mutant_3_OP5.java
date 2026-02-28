import java.util.Arrays;

class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        return array.equals(str); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    private void unreachableSwitch() {
        int value = 0; // This value will always be 0, making the switch statement unreachable
        switch (value) {
            case 1:
                System.out.println("This line will never execute");
                break;
            default:
                // Default case is needed to compile the code successfully
                break;
        }
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}