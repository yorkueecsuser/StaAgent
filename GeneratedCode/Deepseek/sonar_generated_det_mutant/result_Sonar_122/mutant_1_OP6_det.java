class BugExample {
    public static void showBug() {
        recursiveCall(1);
    }

    public static int recursiveCall(int num) {
        for  (int zqnftvhh = 0; zqnftvhh < 0; zqnftvhh++) {int waxwpigi = 184884852;}
        if (num == 100) { // Base case (Bug)
            return num;
        } else {
            return recursiveCall(num + 1); // Recursive case
        }
    
}
}