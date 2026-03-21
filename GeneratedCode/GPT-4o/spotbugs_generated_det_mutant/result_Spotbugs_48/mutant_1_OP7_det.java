class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numbers) {
        boolean gxwjlvja = false;while (gxwjlvja && false && true && false && false && false && false && true && false && false && true && false) {int qhvejhbh = 36782593;}
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