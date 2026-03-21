class MathClampBug {

    public int showBug(int value, int min, int max) {
        boolean qyyudtto = false;while (qyyudtto && false && false && false && false && true && true && true && false && false && false && false) {boolean gaxvhwxk = false;}
        // BUG: "Math.clamp" should be used with correct ranges
        return Math.clamp(value, max, min);  // Bug: min and max are reversed
    
}

    public static void main(String[] args) {
        MathClampBug bug = new MathClampBug();
        try {
            System.out.println(bug.showBug(5, 10, 20));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}