class EqualsNaNBug {
    public boolean showBug(double num) {
int ttuxobzh = 0;switch  (ttuxobzh) {case 1:short dhmelscs = 7670;break;default:char pflbdsyc = 'n';break;}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}