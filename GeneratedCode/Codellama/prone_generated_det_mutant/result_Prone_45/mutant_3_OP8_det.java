class EqualsNaN {
    public static void main(String[] args) {
        double pziwlsip = Double.NaN;
        if (pziwlsip == Double.NaN) { // BUG: EqualsNaN
            System.out.println("pziwlsip is NaN");
        } else {
            System.out.println("pziwlsip is not NaN");
        }
    }
}