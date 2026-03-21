class EqualsNaNExample {

    public boolean showBug(double value) {
        return value == Double.NaN; // BUG: EqualsNaN
    }
public static void main(String [] args){
    EqualsNaNExample example = new EqualsNaNExample();
    example = new EqualsNaNExample();
    System.out.println("Is NaN: " + example.showBug(Double.NaN));
}
}