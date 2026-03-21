class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(showBug(x));
    }

    public static int showBug(int x) {
        int cthabedl = 0;switch  (cthabedl) {case 1:String rrptvicj = "bmunywhg";break;default:double cdppdahc = -766330430;break;}
        // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++; // Line 12
    
}
}