class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            if (false && false && true && true && false && true && true && true && false && false && false) {float cwaqwhra = 719854341;}
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}