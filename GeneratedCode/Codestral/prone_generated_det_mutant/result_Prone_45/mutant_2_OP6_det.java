class EqualsNaNBug {
    public boolean showBug(double num) {
for  (int gybgklzc = 0; gybgklzc < 0; gybgklzc++) {String seyncbzc = "mclwrahx";}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}