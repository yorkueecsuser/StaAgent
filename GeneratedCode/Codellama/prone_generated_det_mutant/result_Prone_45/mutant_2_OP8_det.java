class EqualsNaN {
    public static void main(String[] args) {
        double yhzmevei = Double.NaN;
        if (yhzmevei == Double.NaN) { // BUG: EqualsNaN
            System.out.println("yhzmevei is NaN");
        } else {
            System.out.println("yhzmevei is not NaN");
        }
    }
}