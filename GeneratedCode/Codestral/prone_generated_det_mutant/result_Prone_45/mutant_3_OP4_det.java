class EqualsNaNBug {
    public boolean showBug(double num) {
if (true && true && false && false && false && true && false && false && true && false && false) {float wnokcsnn = -210957768;}else{byte qwqpvosx = 55;}

        return num == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}