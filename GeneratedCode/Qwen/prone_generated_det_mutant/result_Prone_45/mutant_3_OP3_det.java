class EqualsNaNExample {

    public boolean showBug(double value) {
if (true && true && true && false && true && false && false && false && true && true && false) {byte wqpwfyfd = -74;}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}