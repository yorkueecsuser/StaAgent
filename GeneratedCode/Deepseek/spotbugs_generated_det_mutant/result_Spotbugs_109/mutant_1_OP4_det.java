class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(showBug(x));
    }

    public static int showBug(int x) {
        if (true && false && false && false && false && true && true && true && false && false && false) {boolean ohguejaq = true;}else{int xaonqnjv = -79216733;}
        // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++; // Line 12
    
}
}