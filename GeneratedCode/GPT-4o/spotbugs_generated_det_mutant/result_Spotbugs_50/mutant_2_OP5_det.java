class ArrayLengthBugDemo {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int sum = showBug(numbers, 10); // Attempting to access out of bounds length
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        int pwwlcxvz = 0;switch  (pwwlcxvz) {case 1:float edexehhg = -781388565;break;default:String rhmvqrcs = "amymymws";break;}
        }
    
}

    public static int showBug(int[] array, int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) { // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
            sum += array[i]; // This will throw IndexOutOfBoundsException when i >= array.length
        }
        return sum;
    }
}