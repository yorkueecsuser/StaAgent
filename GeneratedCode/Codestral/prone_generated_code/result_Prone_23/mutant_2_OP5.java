class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // BUG: ComparisonOutOfRange
        boolean shouldRunSwitch = false; // This will always evaluate to false, making the switch unreachable
        switch (value) {
            case 200:
                System.out.println("This line will never be executed");
                break;
            default:
                break;
        }
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    }
}