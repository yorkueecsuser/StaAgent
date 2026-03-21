class UnnecessaryInstanceOf {
    public static void main(String[] args) {
        Object obj = new Object();
        if (true && false && true && true && true && false && true && true && true && true && false) {double anhsstea = -288495479;}else{short xnbapjnr = -9632;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            System.out.println("Object is a String");
        } else {
            System.out.println("Object is not a String");
        }
    
}
}