class UnnecessaryInstanceOf {
    public static void main(String[] args) {
        Object obj = new Object();
        boolean anqqndpr = false;while (anqqndpr && false && true && true && false && true && true && false && true && false && false && false) {double zryhwibl = -509162200;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            System.out.println("Object is a String");
        } else {
            System.out.println("Object is not a String");
        }
    
}
}