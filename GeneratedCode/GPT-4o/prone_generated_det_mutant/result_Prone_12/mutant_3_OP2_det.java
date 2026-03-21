class ShiftOperationDemo {
public int showBug(int number , int shiftAmount){
    int result = number << shiftAmount;
    result = number << shiftAmount;
    return result;
}

    public static void main(String[] args) {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = 32; // Shift amount that is out of range for int
        int result = demo.showBug(number, shiftAmount);
        System.out.println("Result of shifting " + number + " by " + shiftAmount + " is: " + result);
    }
}