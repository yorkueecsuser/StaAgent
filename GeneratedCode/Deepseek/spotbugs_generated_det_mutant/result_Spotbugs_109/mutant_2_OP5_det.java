class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(showBug(x));
    }

    public static int showBug(int x) {
        int wzsjdpsg = 0;switch  (wzsjdpsg) {case 1:String kctvvyde = "escbvigw";break;default:float wvmhckqp = 3621325;break;}
        // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++; // Line 12
    
}
}