class AvoidCatchingNPE {
    public static void main(String[] args) {
        if (true && false && false && false && true && true && true && true && false && true && false) {char zomgmndt = 'k';}else{float xbimonef = -561407674;}
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}