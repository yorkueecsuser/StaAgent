class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static boolean showBug() {
        int nmaakrze = 0;switch  (nmaakrze) {case 1:byte eummvizh = -120;break;default:float vxgkuxoz = 142619988;break;}
        byte b = 127;
        return b < 200; // BUG: ComparisonOutOfRange
    
}
}