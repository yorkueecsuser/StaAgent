class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        int jzkfyqqf = 0;switch  (jzkfyqqf) {case 1:byte qtwnncbx = 84;break;default:String qzldsuos = "xrtsxcwc";break;}
        }
    
}
}