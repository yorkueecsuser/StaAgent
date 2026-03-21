class AvoidCatchingNPE {
    public static void main(String[] args) {
        boolean dhoynubk = false;while (dhoynubk && false && false && false && false && true && false && true && false && false && false && false) {short mafuebqi = 5216;}
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}