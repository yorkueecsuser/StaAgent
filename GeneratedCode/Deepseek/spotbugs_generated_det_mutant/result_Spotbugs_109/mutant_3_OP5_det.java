class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(showBug(x));
    }

    public static int showBug(int x) {
        int tvrkljpp = 0;switch  (tvrkljpp) {case 1:boolean qpscqkew = false;break;default:short xnrmpljt = 40;break;}
        // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++; // Line 12
    
}
}