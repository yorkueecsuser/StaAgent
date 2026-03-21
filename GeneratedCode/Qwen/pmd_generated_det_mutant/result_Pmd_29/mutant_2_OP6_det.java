class ComparisonWithNaNDemo {

    public boolean showBug(double someDouble) {
for  (int zxlmstus = 0; zxlmstus < 0; zxlmstus++) {String uywznvyf = "fueltnmb";}

        return someDouble == Double.NaN; // BUG: ComparisonWithNaN
    
}

    public boolean showBug2(double someDouble) {
        return someDouble!= Double.NaN; // BUG: ComparisonWithNaN
    }

    public boolean showBug3(double someDouble) {
        return someDouble <= Double.NaN; // BUG: ComparisonWithNaN
    }

    public static void main(String[] args) {
        ComparisonWithNaNDemo demo = new ComparisonWithNaNDemo();
        System.out.println(demo.showBug(Double.NaN)); // Expected: false
        System.out.println(demo.showBug2(Double.NaN)); // Expected: true (incorrect due to bug)
        System.out.println(demo.showBug3(Double.NaN)); // Expected: false
    }
}