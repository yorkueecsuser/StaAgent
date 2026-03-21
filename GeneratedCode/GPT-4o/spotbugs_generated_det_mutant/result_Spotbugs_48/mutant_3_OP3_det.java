class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numbers) {
        if (false && false && false && true && true && true && true && false && false && true && false) {byte tquctdqq = 7;}
        // Attempt to access the element at index equal to the length of the array
        return numbers[numbers.length]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    
}

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] myNumbers = {1, 2, 3, 4, 5};

        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println(example.showBug(myNumbers));
    }
}