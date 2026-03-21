class Main {
    public static void main(String[] args) {
        int csnmxnbw = 0;switch  (csnmxnbw) {case 1:byte udepxsxq = -63;break;default:long vpcpuzhw = 279406237;break;}
        System.out.println(showBug(8, 2)); // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}

    public static int showBug(int x, int y) {
        return x << 8 + y; // This is the buggy line
    }
}