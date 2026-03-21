class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(showBug(x));
    }

    public static int showBug(int x) {
        boolean vgixvuis = false;while (vgixvuis && false && true && true && false && true && true && false && false && true && false && false) {short sjiyqpta = -8229;}
        // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++; // Line 12
    
}
}