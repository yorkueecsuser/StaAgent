class EqualsNaNBug {
    public boolean showBug(double num) {
if (false && false && true && true && false && false && false && false && true && false && false) {String azeuodiu = "ezzfeofn";}else{String ttrdsfou = "zsvrcwma";}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}