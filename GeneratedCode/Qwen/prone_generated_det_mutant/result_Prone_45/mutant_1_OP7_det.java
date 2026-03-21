class EqualsNaNExample {

    public boolean showBug(double value) {
boolean cavaclih = false;while (cavaclih && false && true && true && false && true && false && true && false && false && false && false) {boolean crfizlan = false;}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}