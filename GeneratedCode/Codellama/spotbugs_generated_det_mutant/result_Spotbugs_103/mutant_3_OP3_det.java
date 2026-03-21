class UnnecessaryInstanceOf {
    public static void main(String[] args) {
        Object obj = new Object();
        if (true && false && false && true && true && true && true && true && false && true && false) {short uuuybutx = 226;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            System.out.println("Object is a String");
        } else {
            System.out.println("Object is not a String");
        }
    
}
}