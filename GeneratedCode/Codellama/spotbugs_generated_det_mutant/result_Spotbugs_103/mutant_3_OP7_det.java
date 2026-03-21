class UnnecessaryInstanceOf {
    public static void main(String[] args) {
        Object obj = new Object();
        boolean xlwjmmop = false;while (xlwjmmop && false && false && false && false && true && false && false && true && false && false && false) {String ecjeipoz = "djknmkyx";}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            System.out.println("Object is a String");
        } else {
            System.out.println("Object is not a String");
        }
    
}
}