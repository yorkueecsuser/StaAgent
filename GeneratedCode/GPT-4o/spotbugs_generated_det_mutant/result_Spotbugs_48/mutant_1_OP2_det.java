class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] numbers) {
        // Attempt to access the element at index equal to the length of the array
        return numbers[numbers.length]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }
public static void main(String [] args){
    ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
    example = new ArrayIndexOutOfBoundsExample();
    int [] myNumbers = { 1 , 2 , 3 , 4 , 5 };
    System.out.println(example.showBug(myNumbers));
}
}