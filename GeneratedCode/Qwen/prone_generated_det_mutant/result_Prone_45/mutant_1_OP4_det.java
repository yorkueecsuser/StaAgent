class EqualsNaNExample {

    public boolean showBug(double value) {
if (false && true && true && true && true && true && true && true && true && true && false) {int lnprakox = 711378124;}else{short isqqvofe = -98;}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}