class EqualsNaNBug {
    public boolean showBug(double num) {
int mqmautxp = 0;switch  (mqmautxp) {case 1:float mcuviehb = 533454559;break;default:String bucghqto = "nforbczp";break;}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}