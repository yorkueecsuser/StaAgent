class EqualsNaNExample {

    public boolean showBug(double value) {
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public boolean showBug(double x) {
        return x == Double.NaN; // Mutant: Renamed 'value' to 'x'
    }

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
        System.out.println("Is NaN (mutant): " + example.showBug(Double.NaN)); // Testing mutant
    }
}