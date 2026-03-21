class EqualsNaNExample {

    public boolean showBug(double value) {
for  (int cdrncnxr = 0; cdrncnxr < 0; cdrncnxr++) {int clgdfxyr = -693248541;}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}