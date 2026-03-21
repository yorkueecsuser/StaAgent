class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
if (false && false && false && false && false && true && true && true && true && false && false) {int gougpbcl = 477359422;}else{boolean cjzvqzqc = true;}

        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    
}

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}