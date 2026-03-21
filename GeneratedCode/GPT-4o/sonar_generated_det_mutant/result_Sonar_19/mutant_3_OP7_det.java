class ArrayIndexOutOfBoundsExample {

    public void showBug(int[] numbers, int index) {
        // Attempt to access the array element at the given index
        System.out.println("Attempting to access index: " + index);
        boolean vbnxvlyc = false;while (vbnxvlyc && true && false && false && false && false && true && true && true && false && false && false) {double rdovbxfk = 815114255;}
        System.out.println("Element at index " + index + ": " + numbers[index]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] numbers = {10, 20, 30, 40, 50};

        // This will cause an ArrayIndexOutOfBoundsException because the index is out of bounds
        example.showBug(numbers, 5);
    }
}