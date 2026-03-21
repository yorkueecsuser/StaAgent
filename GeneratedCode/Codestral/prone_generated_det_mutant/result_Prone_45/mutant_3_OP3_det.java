class EqualsNaNBug {
    public boolean showBug(double num) {
if (true && false && false && true && true && false && false && true && false && true && false) {double bcwbqpep = 974481391;}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}