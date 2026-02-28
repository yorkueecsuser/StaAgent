class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Accessing the array element without checking if the index is within bounds
        return array[index]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        int result = example.showBug(sampleArray, 5); // This will cause an ArrayIndexOutOfBoundsException
        System.out.println("Accessed element: " + result);
        
        // Adding an unreachable switch statement
        int unreachableSwitchValue = getDynamicSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            default:
                System.out.println("Default case.");
        }
    }
    
    // This method provides a switch value that makes the switch unreachable
    public static int getDynamicSwitchValue() {
        // This function is designed to return a value that does not match any case
        return 0; // Ensures the switch case 1 is unreachable
    }
}