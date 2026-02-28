class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
        boolean flag = true;
        switch (flag) {
            case false:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is reachable");
                break;
        }
    }
}