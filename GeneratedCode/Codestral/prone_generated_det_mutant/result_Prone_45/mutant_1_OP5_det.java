class EqualsNaNBug {
    public boolean showBug(double num) {
int iffrfccr = 0;switch  (iffrfccr) {case 1:short tnsysozy = 3326;break;default:int tduzjcnz = 42439230;break;}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}