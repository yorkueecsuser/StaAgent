class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] uyudiict = {1, 2, 3};
        System.out.println(example.showBug(uyudiict, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}