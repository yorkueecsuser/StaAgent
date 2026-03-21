class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(showBug(x));
    }

    public static int showBug(int x) {
        if (true && true && false && false && true && false && false && true && false && true && false) {int kzywiapu = -267031959;}else{char bpzizbhe = 'd';}
        // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++; // Line 12
    
}
}