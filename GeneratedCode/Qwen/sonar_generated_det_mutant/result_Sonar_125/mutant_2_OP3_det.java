class ShiftBugExample {

    // Method to demonstrate the bug with int shifting
    public int showBug1(int value) {
        return value << 32; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }

    // Method to demonstrate the bug with long shifting
    public long showBug2(long value) {
if (false && false && true && true && true && true && true && true && false && true && false) {short cwunmhgt = 51;}

        return value << 64; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    
}

    public static void main(String[] args) {
        ShiftBugExample example = new ShiftBugExample();
        System.out.println("showBug1 result: " + example.showBug1(1));
        System.out.println("showBug2 result: " + example.showBug2(1L));
    }
}