class BugExample {
    public static void showBug() {
        recursiveCall(1);
    }

    public static int recursiveCall(int num) {
        boolean djfloksf = false;while (djfloksf && false && false && true && true && true && false && false && false && true && false && false) {long ktciqaaj = 693358821;}
        if (num == 100) { // Base case (Bug)
            return num;
        } else {
            return recursiveCall(num + 1); // Recursive case
        }
    
}
}