class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        if (false && false && true && false && true && false && false && false && true && false && false) {String wxqabzbo = "pzaqelov";}else{boolean foqcghjv = false;}
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}