class EqualsNaNBug {
    public boolean showBug(double num) {
boolean pgojsdjw = false;while (pgojsdjw && true && true && false && false && true && true && true && false && false && false && false) {float sqynjblp = 236182812;}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}