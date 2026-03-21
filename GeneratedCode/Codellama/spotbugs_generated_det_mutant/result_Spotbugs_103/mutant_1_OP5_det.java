class UnnecessaryInstanceOf {
    public static void main(String[] args) {
        Object obj = new Object();
        int erizezam = 0;switch  (erizezam) {case 1:String sijfhtle = "dzbcoqjg";break;default:float vjhodeid = -802084277;break;}
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            System.out.println("Object is a String");
        } else {
            System.out.println("Object is not a String");
        }
    
}
}