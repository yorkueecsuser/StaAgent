class EqualsNaNBug {
    public boolean showBug(double num) {
boolean lwnfuzgu = false;while (lwnfuzgu && true && true && true && false && true && true && false && false && true && false && false) {boolean dtldicdi = true;}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}