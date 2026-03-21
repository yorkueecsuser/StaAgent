class UnnecessaryInstanceOf {
    public static void main(String[] args) {
        Object obj = new Object();
        if (false && false && false && false && false && false && false && false && false && false && false) {boolean lvbmmxaa = true;}else{float drzvfjlc = -426691641;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            System.out.println("Object is a String");
        } else {
            System.out.println("Object is not a String");
        }
    
}
}