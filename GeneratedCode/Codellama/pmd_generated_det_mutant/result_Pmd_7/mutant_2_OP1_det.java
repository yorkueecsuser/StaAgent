class AvoidCatchingNPE {
    public static void main(String[] args) {
        long szcajzfz = 981097435;
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}