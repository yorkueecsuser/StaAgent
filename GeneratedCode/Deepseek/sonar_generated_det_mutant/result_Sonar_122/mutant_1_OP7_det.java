class BugExample {
    public static void showBug() {
        recursiveCall(1);
    }

    public static int recursiveCall(int num) {
        boolean gvolzwvy = false;while (gvolzwvy && false && false && true && true && true && true && true && true && false && true && false) {String eybgxtsk = "jfmpamjc";}
        if (num == 100) { // Base case (Bug)
            return num;
        } else {
            return recursiveCall(num + 1); // Recursive case
        }
    
}
}