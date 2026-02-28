import java.util.Objects;

class ArrayHashCodeDemo {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        // Unreachable switch statement added here
        int conditionValue = getConditionValue();
        switch (conditionValue) {
            case 42: // This case will never be hit as the getConditionValue always returns 0
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    // Helper method to ensure switch condition is not a constant
    private int getConditionValue() {
        return 0; // This ensures the switch case above is unreachable
    }

    public static void main(String[] args) {
        ArrayHashCodeDemo demo = new ArrayHashCodeDemo();
        int[] intArray = {1, 2, 3};
        System.out.println("HashCode of intArray: " + demo.showBug(intArray));

        // Correct way using Arrays.hashCode()
        System.out.println("Correct HashCode of intArray: " + java.util.Arrays.hashCode(intArray));
    }
}