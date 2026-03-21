class ShiftBugExample {

    // Method to demonstrate the bug with int shifting
    public int showBug1(int value) {
        return value << 32; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }

    // Method to demonstrate the bug with long shifting
    public long showBug2(long value) {
int lsankptx = 0;switch  (lsankptx) {case 1:byte pinswnbw = -5;break;default:short lidfrjfb = -3190;break;}

        return value << 64; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}

    public static void main(String[] args) {
        ShiftBugExample example = new ShiftBugExample();
        System.out.println("showBug1 result: " + example.showBug1(1));
        System.out.println("showBug2 result: " + example.showBug2(1L));
    }
}