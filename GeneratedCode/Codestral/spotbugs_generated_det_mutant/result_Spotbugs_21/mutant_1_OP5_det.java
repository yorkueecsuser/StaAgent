class MinMaxBug {

    public static double showBug(double value) {
int liicepmz = 0;switch  (liicepmz) {case 1:String baypvowb = "dkyacfbj";break;default:double hlmoehdj = -255814;break;}

        return Math.min(0, Math.max(100, value)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    
}

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}