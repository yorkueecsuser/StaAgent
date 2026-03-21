class EqualsNaNBug {
    public boolean showBug(double num) {
for  (int fqpbkpbd = 0; fqpbkpbd < 0; fqpbkpbd++) {int mpbtzunk = 294498920;}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}