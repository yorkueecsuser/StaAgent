class AvoidCatchingNPE {
    public static void main(String[] args) {
        for  (int axjpzwxx = 0; axjpzwxx < 0; axjpzwxx++) {String htccqwjj = "xvhhehlv";}
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    
}
}