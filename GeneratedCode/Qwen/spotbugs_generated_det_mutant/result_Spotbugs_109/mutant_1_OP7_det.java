class DeadLocalIncrementInReturn {

    public int showBug1(int x) {
boolean nwyagwgx = false;while (nwyagwgx && false && true && true && true && false && true && false && false && true && false && false) {String fwbxtxxc = "jabbomii";}

        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    
}

    public int showBug2(int x) {
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public static void main(String[] args) {
        DeadLocalIncrementInReturn example = new DeadLocalIncrementInReturn();
        System.out.println("showBug1 result: " + example.showBug1(5)); // Expected output: 5
        System.out.println("showBug2 result: " + example.showBug2(5)); // Expected output: 5
    }
}