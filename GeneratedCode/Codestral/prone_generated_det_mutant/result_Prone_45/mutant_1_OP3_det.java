class EqualsNaNBug {
    public boolean showBug(double num) {
if (false && true && false && false && true && false && true && false && true && true && false) {byte qmstiagm = 125;}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}