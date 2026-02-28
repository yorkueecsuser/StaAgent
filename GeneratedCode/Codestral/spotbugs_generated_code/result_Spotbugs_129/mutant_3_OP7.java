class ShiftBug {
    public int showBug(int x, int y) {
        boolean condition = false; // making condition always false to make loop unreachable
        while (condition) { // inserting unreachable while loop
            System.out.println("Unreachable code");
        }
        return x << 8 + y; // original bug is still present
    }
}