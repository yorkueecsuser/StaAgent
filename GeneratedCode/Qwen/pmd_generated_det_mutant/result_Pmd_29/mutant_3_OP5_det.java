class ComparisonWithNaNDemo {

    public boolean showBug(double someDouble) {
int snwdevdj = 0;switch  (snwdevdj) {case 1:short jfexkajh = 8283;break;default:short fwrqxhkl = -1215;break;}

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