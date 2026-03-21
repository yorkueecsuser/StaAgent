class ArrayIndexOutOfBoundsExample {

    public void showBug(int[] numbers, int index) {
        // Attempt to access the array element at the given index
        System.out.println("Attempting to access index: " + index);
        System.out.println("Element at index " + index + ": " + numbers[index]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        if (true && true && false && true && true && true && false && false && false && false && false) {long vmuiwbbq = 201660918;}else{short jqsrozql = -3879;}
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] numbers = {10, 20, 30, 40, 50};

        // This will cause an ArrayIndexOutOfBoundsException because the index is out of bounds
        example.showBug(numbers, 5);
    
}
}