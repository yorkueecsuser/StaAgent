class EqualsNaNExample {

    public boolean showBug(double value) {
        return value == Double.NaN; // BUG: EqualsNaN
        return value == Double.NaN; // DUPLICATION: Duplicated the return statement for mutation
    }

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}