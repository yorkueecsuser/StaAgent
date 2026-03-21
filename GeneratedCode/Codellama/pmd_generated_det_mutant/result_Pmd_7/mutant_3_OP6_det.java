class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            for  (int flcmzdse = 0; flcmzdse < 0; flcmzdse++) {int xlwlcval = -354425980;}
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}