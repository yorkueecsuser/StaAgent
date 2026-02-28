class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // BUG: ComparisonOutOfRange
        boolean shouldSwitch = shouldNeverSwitch();
        switch(shouldSwitch? 1 : 0) {
            case 1:
                System.out.println("This line should never print.");
                break;
        }
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    }

    private boolean shouldNeverSwitch() {
        return false;
    }
}