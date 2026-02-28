import java.util.Objects;

class ArrayHashCodeDemo {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    private int getSwitchCondition() {
        return 0; // Ensures the switch condition is unreachable
    }

    public static void main(String[] args) {
        ArrayHashCodeDemo demo = new ArrayHashCodeDemo();
        int[] intArray = {1, 2, 3};
        System.out.println("HashCode of intArray: " + demo.showBug(intArray));

        // Correct way using Arrays.hashCode()
        System.out.println("Correct HashCode of intArray: " + java.util.Arrays.hashCode(intArray));

        // Inserting unreachable switch statement
        int switchValue = demo.getSwitchCondition();
        switch(switchValue) {
            case 1:
                System.out.println("Unreachable case 1");
                break;
            case 2:
                System.out.println("Unreachable case 2");
                break;
            default:
                // This default block will always execute as switchValue is always 0
                System.out.println("Default case");
                break;
        }
    }
}