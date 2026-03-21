class BugExample {
    public static void showBug() {
        recursiveCall(1);
    }

    public static int recursiveCall(int num) {
        if (false && true && true && true && true && true && true && true && false && false && false) {boolean gahvmkav = false;}else{String wpidarxf = "kjvgkzyv";}
        if (num == 100) { // Base case (Bug)
            return num;
        } else {
            return recursiveCall(num + 1); // Recursive case
        }
    
}
}