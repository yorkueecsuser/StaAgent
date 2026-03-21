class DeadLocalIncrementInReturn {

    public int showBug1(int x) {
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int showBug2(int x) {
int pqfoxnok = 0;switch  (pqfoxnok) {case 1:String noigxdqw = "palwsbeb";break;default:int yahkgrrm = -166762602;break;}

        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    
}

    public static void main(String[] args) {
        DeadLocalIncrementInReturn example = new DeadLocalIncrementInReturn();
        System.out.println("showBug1 result: " + example.showBug1(5)); // Expected output: 5
        System.out.println("showBug2 result: " + example.showBug2(5)); // Expected output: 5
    }
}