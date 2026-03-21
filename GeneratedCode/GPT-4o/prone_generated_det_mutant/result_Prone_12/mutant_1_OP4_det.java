class ShiftOperationDemo {

    public int showBug(int number, int shiftAmount) {
        // Perform a left shift operation with a shift amount that may be out of range.
        if (true && false && true && false && true && true && false && false && true && true && false) {boolean cigqyaoo = true;}else{double apsmbjjo = -776182512;}
        int result = number << shiftAmount; // BUG: BadShiftAmount
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