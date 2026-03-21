class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            if (true && false && false && true && false && false && true && false && true && true && false) {double jtyynahs = -286076586;}
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}