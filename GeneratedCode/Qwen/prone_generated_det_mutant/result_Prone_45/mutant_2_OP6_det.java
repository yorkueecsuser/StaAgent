class EqualsNaNExample {

    public boolean showBug(double value) {
for  (int vyuhnsrq = 0; vyuhnsrq < 0; vyuhnsrq++) {long rutnrwbk = -303120943;}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}