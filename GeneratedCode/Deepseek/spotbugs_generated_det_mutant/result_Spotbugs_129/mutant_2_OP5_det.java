class Main {
    public static void main(String[] args) {
        int rtizxsjn = 0;switch  (rtizxsjn) {case 1:boolean yxbedtqy = true;break;default:long oshakxnm = 775027352;break;}
        System.out.println(showBug(8, 2)); // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    
}

    public static int showBug(int x, int y) {
        return x << 8 + y; // This is the buggy line
    }
}