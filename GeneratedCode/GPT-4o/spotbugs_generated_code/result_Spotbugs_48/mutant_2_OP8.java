class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numArray) {
        // Attempt to access the element at index equal to the length of the array
        return numArray[numArray.length]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample ex = new ArrayIndexOutOfBoundsExample();
        int[] numbersArray = {1, 2, 3, 4, 5};

        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println(ex.showBug(numbersArray));
    }
}