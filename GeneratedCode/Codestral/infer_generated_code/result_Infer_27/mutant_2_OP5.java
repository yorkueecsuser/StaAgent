import java.util.Arrays;

class BufferOverrunL3 {

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(int[] arr, int index, int value) {
        arr[index] = value; // Bug: Buffer Overrun L3

        // Mutation Operator: Unreachable switch statement
        if(getUnreachableCondition()) {
            switch(value) {
                case 1:
                    System.out.println("This line should never be reached.");
                    break;
            }
        }

        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        BufferOverrunL3 ex = new BufferOverrunL3();
        ex.showBug(arr, 11, 123); // Accessing index 11 which is out of bounds
    }
}