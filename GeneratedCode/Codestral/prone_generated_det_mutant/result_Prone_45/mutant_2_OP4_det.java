class EqualsNaNBug {
    public boolean showBug(double num) {
if (true && false && false && false && true && true && false && false && false && false && false) {long ycmciteo = 929523110;}else{int vkjdhcso = -119129594;}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}