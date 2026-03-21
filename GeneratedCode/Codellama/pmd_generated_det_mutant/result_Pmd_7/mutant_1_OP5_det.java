class AvoidCatchingNPE {
    public static void main(String[] args) {
        int ybbwysqm = 0;switch  (ybbwysqm) {case 1:boolean inzkxuad = false;break;default:byte yhtbxlzl = -114;break;}
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}