class EqualsNaNExample {

    public boolean showBug(double value) {
if (true && true && true && true && true && false && false && false && false && true && false) {char xmzdwkwt = 'w';}else{byte scyzsjtf = -104;}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}