class ComparisonWithNaNDemo {

    public boolean showBug(double someDouble) {
        return someDouble == Double.NaN; // BUG: ComparisonWithNaN
    }

    public boolean showBug2(double someDouble) {
        return someDouble!= Double.NaN; // BUG: ComparisonWithNaN
    }

    public boolean showBug3(double someDouble) {
        return someDouble <= Double.NaN; // BUG: ComparisonWithNaN
    }
public static void main(String [] args){
    ComparisonWithNaNDemo demo = new ComparisonWithNaNDemo();
    demo = new ComparisonWithNaNDemo();
    System.out.println(demo.showBug(Double.NaN));
    System.out.println(demo.showBug2(Double.NaN));
    System.out.println(demo.showBug3(Double.NaN));
}
}