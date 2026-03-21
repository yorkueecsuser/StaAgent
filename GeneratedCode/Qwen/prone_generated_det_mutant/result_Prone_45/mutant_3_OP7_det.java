class EqualsNaNExample {

    public boolean showBug(double value) {
boolean uoghlrir = false;while (uoghlrir && true && true && false && false && false && false && false && false && false && true && false) {String fprltcvh = "uuuppbtu";}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}