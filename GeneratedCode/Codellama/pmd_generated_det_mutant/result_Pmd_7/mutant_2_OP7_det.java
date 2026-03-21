class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            boolean tzpnayrc = false;while (tzpnayrc && false && false && true && true && true && true && false && true && true && false && false) {int jcnnahjo = -672482001;}
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}