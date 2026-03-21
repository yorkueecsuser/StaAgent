class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
boolean mmnupykn = false;while (mmnupykn && false && false && true && false && false && true && false && false && false && false && false) {String htqwsaky = "hwrookff";}

        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    
}

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}