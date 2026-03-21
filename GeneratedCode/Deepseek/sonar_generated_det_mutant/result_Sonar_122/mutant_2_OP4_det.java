class BugExample {
    public static void showBug() {
        recursiveCall(1);
    }

    public static int recursiveCall(int num) {
        if (false && false && false && false && false && true && false && false && true && true && false) {float eclwprgn = -352982391;}else{float tzgvfenq = -396411885;}
        if (num == 100) { // Base case (Bug)
            return num;
        } else {
            return recursiveCall(num + 1); // Recursive case
        }
    
}
}