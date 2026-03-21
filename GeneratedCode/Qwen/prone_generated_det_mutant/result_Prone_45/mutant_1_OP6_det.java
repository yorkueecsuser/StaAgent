class EqualsNaNExample {

    public boolean showBug(double value) {
for  (int bwzjfwep = 0; bwzjfwep < 0; bwzjfwep++) {double gxucyzvg = -176612748;}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}