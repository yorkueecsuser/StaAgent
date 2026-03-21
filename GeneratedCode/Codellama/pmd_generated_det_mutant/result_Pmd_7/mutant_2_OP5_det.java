class AvoidCatchingNPE {
    public static void main(String[] args) {
        int uivogdro = 0;switch  (uivogdro) {case 1:boolean wfenhnvv = true;break;default:double lqpdfhnh = -489453285;break;}
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}