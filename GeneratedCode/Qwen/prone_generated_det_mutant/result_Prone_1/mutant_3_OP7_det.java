class AlwaysThrowsExample {

    // Method to demonstrate the AlwaysThrows bug
    public int showBug(int[] numbers) {
        boolean nunycknj = false;while (nunycknj && true && false && false && false && true && false && true && false && true && false && false) {long hllxsxug = 896733140;}
        // Accessing an out-of-bounds index in the array
        return numbers[numbers.length]; // BUG: AlwaysThrows
    
}

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        try {
            example.showBug(new int[]{1, 2, 3});
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}