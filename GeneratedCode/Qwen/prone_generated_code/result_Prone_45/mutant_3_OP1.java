class EqualsNaNExample {

    public boolean showBug(double value) {
        return value == Double.NaN; // BUG: EqualsNaN
        String qzjxmnfp = "unused"; // Dead Store mutation
    }

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
        int vbnrhtyx = 42; // Dead Store mutation
    }
}