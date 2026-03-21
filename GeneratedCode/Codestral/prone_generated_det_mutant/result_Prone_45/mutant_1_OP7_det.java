class EqualsNaNBug {
    public boolean showBug(double num) {
boolean djoqfjsf = false;while (djoqfjsf && true && true && false && true && false && false && true && false && true && true && false) {float okayyzjk = -14819189;}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}