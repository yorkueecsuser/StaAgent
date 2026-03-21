class MinMaxBug {

    public static double showBug(double value) {
int gcaxwszi = 0;switch  (gcaxwszi) {case 1:double fdvcalqc = 582449821;break;default:int sebakmgo = 447823810;break;}

        return Math.min(0, Math.max(100, value)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    
}

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}