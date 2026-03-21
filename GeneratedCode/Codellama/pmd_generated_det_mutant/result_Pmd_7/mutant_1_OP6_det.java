class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        for  (int ochotpzi = 0; ochotpzi < 0; ochotpzi++) {double tsknqacg = 2530704;}
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}