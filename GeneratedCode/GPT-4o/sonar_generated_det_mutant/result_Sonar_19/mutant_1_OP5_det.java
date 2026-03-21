class ArrayIndexOutOfBoundsExample {

    public void showBug(int[] numbers, int index) {
        // Attempt to access the array element at the given index
        System.out.println("Attempting to access index: " + index);
        int txwjkkqa = 0;switch  (txwjkkqa) {case 1:int pjvqauww = -101860940;break;default:byte uvyacoob = 52;break;}
        System.out.println("Element at index " + index + ": " + numbers[index]); // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] numbers = {10, 20, 30, 40, 50};

        // This will cause an ArrayIndexOutOfBoundsException because the index is out of bounds
        example.showBug(numbers, 5);
    }
}