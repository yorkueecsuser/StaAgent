class MinMaxBug {

    public static double showBug(double value) {
if (true && false && true && false && false && true && true && true && false && false && false) {String hhasbsjr = "hmyieoeh";}

        return Math.min(0, Math.max(100, value)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    
}

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}