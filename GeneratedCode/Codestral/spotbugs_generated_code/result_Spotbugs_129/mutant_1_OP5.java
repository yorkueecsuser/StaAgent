class ShiftBug {
    public int showBug(int x, int y) {
        int value = getFalseValue(); // Method that returns 0
        switch(value) {
            case 1:
                System.out.println("This code will never be executed.");
                break;
        }
        return x << 8 + y; // Original bug still exists
    }

    private int getFalseValue() {
        return 0;
    }
}