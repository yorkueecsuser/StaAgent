class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(showBug(x));
    }

    public static int showBug(int x) {
        boolean samjdabs = false;while (samjdabs && true && true && true && false && true && true && false && true && true && true && false) {double yhmousbt = -142669713;}
        // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++; // Line 12
    
}
}