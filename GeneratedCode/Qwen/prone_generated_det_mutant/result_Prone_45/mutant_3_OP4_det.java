class EqualsNaNExample {

    public boolean showBug(double value) {
if (true && true && true && true && true && false && true && true && true && false && false) {boolean zeahlxno = true;}else{short gtcniuaz = -8220;}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}