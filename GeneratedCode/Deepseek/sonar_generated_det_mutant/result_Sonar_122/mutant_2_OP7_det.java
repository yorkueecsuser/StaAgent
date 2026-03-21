class BugExample {
    public static void showBug() {
        recursiveCall(1);
    }

    public static int recursiveCall(int num) {
        boolean vohrgfol = false;while (vohrgfol && false && false && true && false && false && true && true && false && true && false && false) {int uqkefjdw = 506390243;}
        if (num == 100) { // Base case (Bug)
            return num;
        } else {
            return recursiveCall(num + 1); // Recursive case
        }
    
}
}