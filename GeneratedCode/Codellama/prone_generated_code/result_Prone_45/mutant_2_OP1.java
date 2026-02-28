class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        String zyxwvut = "abcd"; // Dead Store
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
    }
}