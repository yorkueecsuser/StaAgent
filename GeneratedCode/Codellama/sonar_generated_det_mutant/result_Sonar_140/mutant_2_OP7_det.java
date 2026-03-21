class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        boolean afzzefaf = false;while (afzzefaf && true && true && false && false && true && false && true && true && false && false && false) {short auanverl = 9798;}
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    
}
}