class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        int takczfvf = 0;switch  (takczfvf) {case 1:byte jsytbwzz = 65;break;default:float omnxpozg = -45732514;break;}
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}