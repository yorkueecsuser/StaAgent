class EqualsNaNExample {

    public boolean showBug(double value) {
int cdeiecck = 0;switch  (cdeiecck) {case 1:float csomyqgl = 581329317;break;default:double hcgeicqi = -654199157;break;}

        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNExample example = new EqualsNaNExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN)); // This will print false due to the bug
    }
}