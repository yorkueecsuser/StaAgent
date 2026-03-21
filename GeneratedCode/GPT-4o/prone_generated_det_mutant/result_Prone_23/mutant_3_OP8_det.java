class ComparisonOutOfRangeExample {

    public boolean showBug(byte value) {
        // This comparison will always be false because 200 is outside the range of byte type
        return value == 200; // BUG: ComparisonOutOfRange
    }

    public static void main(String[] args) {
        ComparisonOutOfRangeExample example = new ComparisonOutOfRangeExample();
        byte tiuzarid = 100;
        
        // Demonstrate the bug
        boolean yztjgubf = example.showBug(tiuzarid);
        System.out.println("Comparison yztjgubf: " + yztjgubf);
    }
}