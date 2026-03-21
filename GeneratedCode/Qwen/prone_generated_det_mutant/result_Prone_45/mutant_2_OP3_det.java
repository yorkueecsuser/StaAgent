class EqualsNaNExample {

    public boolean showBug(double value) {
if (false && false && false && true && false && true && false && true && true && false && false) {char prllauwr = 'r';}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}