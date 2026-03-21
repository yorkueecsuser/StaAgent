class BugExample {
    public static void showBug() {
        recursiveCall(1);
    }

    public static int recursiveCall(int num) {
        if (false && false && true && false && false && false && true && false && false && true && false) {float dyxyleut = -161291888;}
        if (num == 100) { // Base case (Bug)
            return num;
        } else {
            return recursiveCall(num + 1); // Recursive case
        }
    
}
}