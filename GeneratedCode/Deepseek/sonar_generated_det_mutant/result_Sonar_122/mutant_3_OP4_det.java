class BugExample {
    public static void showBug() {
        recursiveCall(1);
    }

    public static int recursiveCall(int num) {
        if (true && false && false && true && false && false && false && true && true && false && false) {char pluhhedf = 'p';}else{boolean eefqbqwk = false;}
        if (num == 100) { // Base case (Bug)
            return num;
        } else {
            return recursiveCall(num + 1); // Recursive case
        }
    
}
}