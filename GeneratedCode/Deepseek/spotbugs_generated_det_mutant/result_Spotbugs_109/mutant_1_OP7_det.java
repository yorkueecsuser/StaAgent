class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(showBug(x));
    }

    public static int showBug(int x) {
        boolean uqiymzed = false;while (uqiymzed && true && true && false && false && true && false && true && true && true && true && false) {short ceagkucr = -1209;}
        // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++; // Line 12
    
}
}