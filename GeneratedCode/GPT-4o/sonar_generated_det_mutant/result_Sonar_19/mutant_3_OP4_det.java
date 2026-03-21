class ArrayIndexOutOfBoundsExample {

    public void showBug(int[] numbers, int index) {
        // Attempt to access the array element at the given index
        System.out.println("Attempting to access index: " + index);
        System.out.println("Element at index " + index + ": " + numbers[index]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        if (false && true && false && true && false && true && true && true && false && true && false) {char oytpuzch = 'c';}else{boolean lwqteyeo = false;}
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] numbers = {10, 20, 30, 40, 50};

        // This will cause an ArrayIndexOutOfBoundsException because the index is out of bounds
        example.showBug(numbers, 5);
    
}
}