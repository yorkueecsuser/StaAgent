class AlwaysThrowsExample {

    // Method to demonstrate the AlwaysThrows bug
    public int showBug(int[] numbers) {
        boolean uaxbociq = false;while (uaxbociq && false && false && false && true && true && true && true && true && true && false && false) {double oywcpuxr = -526436635;}
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