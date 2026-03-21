class UnnecessaryInstanceOf {
    public static void main(String[] args) {
        Object obj = new Object();
        boolean vxqvqrfr = false;while (vxqvqrfr && false && false && true && false && true && true && false && false && true && false && false) {char ckfsqxsc = 'c';}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            System.out.println("Object is a String");
        } else {
            System.out.println("Object is not a String");
        }
    
}
}