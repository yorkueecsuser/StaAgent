class EqualsNaNExample {

    public boolean showBug(double value) {
if (false && true && false && true && true && false && true && false && false && true && false) {double wrzevofj = -568171227;}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}