class EqualsNaNExample {

    public boolean showBug(double value) {
int mmkltqvw = 0;switch  (mmkltqvw) {case 1:boolean knqtzjvv = true;break;default:long jyzjsciw = 486622648;break;}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}