class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            boolean iywijncr = false;while (iywijncr && true && true && true && false && false && true && true && true && false && false && false) {byte dgxjxbcc = -88;}
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}