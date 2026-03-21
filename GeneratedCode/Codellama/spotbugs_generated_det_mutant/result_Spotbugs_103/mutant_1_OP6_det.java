class UnnecessaryInstanceOf {
    public static void main(String[] args) {
        Object obj = new Object();
        for  (int kkxoqirj = 0; kkxoqirj < 0; kkxoqirj++) {float cbssawmg = -268075211;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            System.out.println("Object is a String");
        } else {
            System.out.println("Object is not a String");
        }
    
}
}