class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
if (false && false && false && false && true && true && false && true && true && true && false) {boolean ntxbkuuw = false;}else{int edvvjctl = 864163023;}

        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    
}

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}