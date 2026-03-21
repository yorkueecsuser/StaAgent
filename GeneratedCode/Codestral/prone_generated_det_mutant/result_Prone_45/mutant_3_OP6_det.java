class EqualsNaNBug {
    public boolean showBug(double num) {
for  (int xthjiwui = 0; xthjiwui < 0; xthjiwui++) {boolean joymzvlv = true;}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}