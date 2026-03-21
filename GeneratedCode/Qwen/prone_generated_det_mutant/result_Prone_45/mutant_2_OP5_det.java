class EqualsNaNExample {

    public boolean showBug(double value) {
int itpwours = 0;switch  (itpwours) {case 1:int uzgjkkfk = -95492329;break;default:double usmnocsg = -221709775;break;}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}