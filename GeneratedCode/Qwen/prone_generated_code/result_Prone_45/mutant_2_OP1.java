class EqualsNaNExample {

    public boolean showBug(double value) {
        String hgfjklmn = "unused"; // Dead Store mutation
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}