class BadShiftAmount {
    public static void main(String[] args) {
        int wzrscjml = 0;switch  (wzrscjml) {case 1:short cobigroa = 2567;break;default:long baosgagq = -322449980;break;}
        int x = 100;
        int y = 32;
        int z = x << y; // BUG: BadShiftAmount
        System.out.println(z);
    
}
}