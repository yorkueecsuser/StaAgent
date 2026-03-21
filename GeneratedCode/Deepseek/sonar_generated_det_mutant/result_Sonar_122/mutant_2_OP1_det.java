class BugExample {
    public static void showBug() {
        recursiveCall(1);
    }

    public static int recursiveCall(int num) {
        long cqpxgadb = -99198834;
        if (num == 100) { // Base case (Bug)
            return num;
        } else {
            return recursiveCall(num + 1); // Recursive case
        }
    
}
}